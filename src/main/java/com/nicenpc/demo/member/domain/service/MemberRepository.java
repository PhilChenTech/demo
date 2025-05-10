package com.nicenpc.demo.member.domain.service;

import com.nicenpc.demo.member.domain.entity.Member;

public interface MemberRepository {
    Member create(Member member);
    Member update(Member member);
    Member findById(Long id);
}
