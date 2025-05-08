package com.nicenpc.demo.validator.member.update;

import com.nicenpc.demo.domain.member.entity.Member;
import com.nicenpc.demo.domain.member.service.findbyid.FindByIdMemberService;
import com.nicenpc.demo.domain.member.service.update.UpdateMemberService;
import com.nicenpc.demo.validator.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("UpdateMemberApplicationServiceImpl")
@RequiredArgsConstructor
public class UpdateMemberApplicationServiceImpl implements ApplicationService<UpdateMemberCommand, Void> {

    private final UpdateMemberService updateMemberService;
    private final FindByIdMemberService findByIdMemberService;

    @Override
    public Void execute(UpdateMemberCommand command) {

        Member member = findByIdMemberService.findById(command.getId());
        if (member == null) {
            throw new RuntimeException("Member not found,memberId=" + command.getId());
        }
        member.setName(command.getName());
        updateMemberService.updateMember(member);
        return null;
    }
}
