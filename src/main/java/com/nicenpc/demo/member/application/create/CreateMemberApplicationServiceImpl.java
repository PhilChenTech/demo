package com.nicenpc.demo.member.application.create;

import com.nicenpc.demo.member.domain.entity.Member;
import com.nicenpc.demo.member.infrastructure.db.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("CreateMemberApplicationServiceImpl")
@RequiredArgsConstructor
public class CreateMemberApplicationServiceImpl implements CreateMemberApplicationService {

    private final MemberDao memberDao;

    @Override
    public Long execute(CreateMemberCommand command) {
        Member member = new Member();
        member.setName(command.getName());
        member.setAge(command.getAge());
        member.setEmail(command.getEmail());
        member.setPhone(command.getPhone());
        member.setEnabled(true);
        return memberDao.create(member).getId();
    }
}
