package com.nicenpc.demo.member.domain.service.findbyid;

import com.nicenpc.demo.member.domain.entity.Member;
import com.nicenpc.demo.member.domain.service.MemberRepository;


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
