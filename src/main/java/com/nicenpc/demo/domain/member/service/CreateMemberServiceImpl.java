package com.nicenpc.demo.domain.member.service;

import com.nicenpc.demo.domain.member.entity.MemberDomain;

public class CreateMemberServiceImpl implements CreateMemberService {
    private final MemberDao memberDao;

    public CreateMemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public Long createMember(MemberDomain memberDomain) {
        MemberDomain savedMemberDomain = memberDao.create(memberDomain);
        return savedMemberDomain.getId();
    }
}
