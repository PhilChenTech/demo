package com.nicenpc.demo.domain.member.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDomain {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private Boolean enabled;
}
