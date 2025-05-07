package com.nicenpc.demo.adapter.member.out.db;

import com.nicenpc.demo.domain.member.entity.MemberDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    MemberDomain convert(MemberEntity memberEntity);

    MemberEntity convert(MemberDomain memberDomain);
}
