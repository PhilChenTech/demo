package com.nicenpc.demo.member.domain.member.service.update;

import com.nicenpc.demo.member.domain.member.entity.Member;
import com.nicenpc.demo.member.domain.member.service.MemberRepository;


public class UpdateMemberServiceImpl implements UpdateMemberService {
    private final MemberRepository memberRepository;

    public UpdateMemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void updateMember(Member member) {
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        //業務邏輯...
        memberRepository.update(member);
    }
}
