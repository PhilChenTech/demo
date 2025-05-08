package com.nicenpc.demo.adapter.member.out.db;

import com.nicenpc.demo.domain.member.entity.Member;
import com.nicenpc.demo.domain.member.service.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberJpaRepository memberJpaRepository;
    private final MemberMapper memberMapper;

    @Override
    public Member create(Member member) {
        MemberEntity memberEntity = memberMapper.convert(member);
        MemberEntity save = memberJpaRepository.save(memberEntity);
        return memberMapper.convert(save);
    }

    @Override
    public Member update(Member member) {
        MemberEntity memberEntity = memberMapper.convert(member);
        MemberEntity save = memberJpaRepository.save(memberEntity);
        return memberMapper.convert(save);
    }

    @Override
    public Member findById(Long id) {
        MemberEntity memberEntity = memberJpaRepository.findById(id).orElse(null);
        return memberMapper.convert(memberEntity);
    }
}
