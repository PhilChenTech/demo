package com.nicenpc.demo.member.domain.member.service;

import com.nicenpc.demo.member.domain.member.entity.Member;

public interface MemberRepository {
    Member create(Member member);
    Member update(Member member);
    Member findById(Long id);
}
