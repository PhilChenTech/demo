package com.nicenpc.demo.member.infrastructure.db;

import com.nicenpc.demo.member.domain.entity.Member;

public interface MemberDao {
    Member create(Member member);
    Member update(Member member);
    Member findById(Long id);
}
