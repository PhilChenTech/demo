package com.nicenpc.demo.member.application.update;

import com.nicenpc.demo.member.domain.entity.Member;
import com.nicenpc.demo.member.infrastructure.db.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateMemberApplicationServiceImpl implements UpdateMemberApplicationService {

    private final MemberDao memberDao;

    @Override
    public void execute(UpdateMemberCommand command) {

        Member member = memberDao.findById(command.getId());
        if (member == null) {
            throw new RuntimeException("Member not found,memberId=" + command.getId());
        }
        member.setName(command.getName());
        memberDao.update(member);
    }
}
