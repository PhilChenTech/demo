package com.nicenpc.demo.infra;

import com.nicenpc.demo.adapter.member.out.db.MemberDaoImpl;
import com.nicenpc.demo.domain.member.service.CreateMemberService;
import com.nicenpc.demo.domain.member.service.CreateMemberServiceImpl;
import com.nicenpc.demo.domain.member.service.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeanRegister {
    private final MemberDao memberDao;

    @Bean
    public CreateMemberService getCreateMemberService(){
        return new CreateMemberServiceImpl(memberDao);
    }
}
