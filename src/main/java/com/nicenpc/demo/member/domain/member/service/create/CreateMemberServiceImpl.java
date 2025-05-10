package com.nicenpc.demo.member.domain.member.service.create;

import com.nicenpc.demo.member.domain.member.entity.Member;
import com.nicenpc.demo.member.domain.member.service.MemberRepository;

public class CreateMemberServiceImpl implements CreateMemberService {
    private final MemberRepository memberRepository;

    public CreateMemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Long createMember(Member member) {
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        Member savedMember = memberRepository.create(member);
        return savedMember.getId();
    }
}
