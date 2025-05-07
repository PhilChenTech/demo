package com.nicenpc.demo.domain.member.service;

import com.nicenpc.demo.domain.member.entity.MemberDomain;

public interface MemberDao {
    MemberDomain create(MemberDomain memberDomain);
}
