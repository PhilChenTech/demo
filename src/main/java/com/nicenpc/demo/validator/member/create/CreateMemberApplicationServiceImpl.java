package com.nicenpc.demo.validator.member.create;

import com.nicenpc.demo.domain.member.entity.Member;
import com.nicenpc.demo.domain.member.service.create.CreateMemberService;
import com.nicenpc.demo.validator.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("CreateMemberApplicationServiceImpl")
@RequiredArgsConstructor
public class CreateMemberApplicationServiceImpl implements ApplicationService<CreateMemberCommand, Long> {

    private final CreateMemberService createMemberService;

    @Override
    public Long execute(CreateMemberCommand command) {
        Member member = new Member();
        member.setName(command.getName());
        member.setAge(command.getAge());
        member.setEmail(command.getEmail());
        member.setPhone(command.getPhone());
        member.setEnabled(true);
        return createMemberService.createMember(member);
    }
}
