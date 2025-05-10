package com.nicenpc.demo.common;

import com.nicenpc.demo.member.domain.service.create.CreateMemberService;
import com.nicenpc.demo.member.domain.service.create.CreateMemberServiceImpl;
import com.nicenpc.demo.member.domain.service.MemberRepository;
import com.nicenpc.demo.member.domain.service.findbyid.FindByIdMemberService;
import com.nicenpc.demo.member.domain.service.findbyid.FindByIdMemberServiceImpl;
import com.nicenpc.demo.member.domain.service.update.UpdateMemberService;
import com.nicenpc.demo.member.domain.service.update.UpdateMemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeanRegister {
    private final MemberRepository memberRepository;

    @Bean
    public CreateMemberService getCreateMemberService() {
        return new CreateMemberServiceImpl(memberRepository);
    }

    @Bean
    public UpdateMemberService getUpdateMemberService() {
        return new UpdateMemberServiceImpl(memberRepository);
    }

    @Bean
    public FindByIdMemberService getFindByIdMemberService() {
        return new FindByIdMemberServiceImpl(memberRepository);
    }
}
