package com.nicenpc.demo.member.domain.member.service.findbyid;

import com.nicenpc.demo.member.domain.member.entity.Member;
import com.nicenpc.demo.member.domain.member.service.MemberRepository;


public class FindByIdMemberServiceImpl implements FindByIdMemberService {
    private final MemberRepository memberRepository;

    public FindByIdMemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member findById(Long id) {
        return memberRepository.findById(id);
    }
}
