package com.nicenpc.demo.adapter.member.out.db;

import com.nicenpc.demo.domain.member.entity.Member;
import com.nicenpc.demo.domain.member.service.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberEntityRepository memberEntityRepository;
    private final MemberMapper memberMapper;

    @Override
    public Member create(Member member) {
        MemberEntity memberEntity = memberMapper.convert(member);
        MemberEntity save = memberEntityRepository.save(memberEntity);
        return memberMapper.convert(save);
    }

    @Override
    public Member update(Member member) {
        MemberEntity memberEntity = memberMapper.convert(member);
        MemberEntity save = memberEntityRepository.save(memberEntity);
        return memberMapper.convert(save);
    }

    @Override
    public Member findById(Long id) {
        MemberEntity memberEntity = memberEntityRepository.findById(id).orElse(null);
        return memberMapper.convert(memberEntity);
    }
}
