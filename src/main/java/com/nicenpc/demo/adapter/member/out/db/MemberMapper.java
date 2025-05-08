package com.nicenpc.demo.adapter.member.out.db;

import com.nicenpc.demo.domain.member.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member convert(MemberEntity memberEntity);

    MemberEntity convert(Member member);
}
