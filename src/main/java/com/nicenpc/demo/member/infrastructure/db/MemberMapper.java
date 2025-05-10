package com.nicenpc.demo.member.infrastructure.db;

import com.nicenpc.demo.member.domain.member.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member convert(MemberEntity memberEntity);

    MemberEntity convert(Member member);
}
