package com.nicenpc.demo.adapter.member.out.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberEntityRepository extends JpaRepository<MemberEntity, Long> {
}