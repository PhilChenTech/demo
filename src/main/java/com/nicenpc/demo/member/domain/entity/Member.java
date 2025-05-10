package com.nicenpc.demo.member.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private Boolean enabled;
}
