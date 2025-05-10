package com.nicenpc.demo.member.infrastructure.db;

import com.nicenpc.demo.member.domain.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class MemberDaoImpl implements MemberDao {
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
