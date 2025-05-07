package com.nicenpc.demo.adapter.member.out.db;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "MEMBER")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private Boolean enabled;
}
