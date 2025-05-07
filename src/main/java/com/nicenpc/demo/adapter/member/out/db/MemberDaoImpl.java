package com.nicenpc.demo.adapter.member.out.db;

import com.nicenpc.demo.domain.member.entity.MemberDomain;
import com.nicenpc.demo.domain.member.service.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDaoImpl implements MemberDao {
    private final MemberEntityRepository memberEntityRepository;
    private final MemberMapper memberMapper;
    @Override
    public MemberDomain create(MemberDomain memberDomain) {
        MemberEntity memberEntity = memberMapper.convert(memberDomain);
        MemberEntity save = memberEntityRepository.save(memberEntity);
        return memberMapper.convert(save);
    }
}
