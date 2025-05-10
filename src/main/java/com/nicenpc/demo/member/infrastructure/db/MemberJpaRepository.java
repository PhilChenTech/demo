package com.nicenpc.demo.member.infrastructure.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {
}