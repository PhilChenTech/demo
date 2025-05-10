package com.nicenpc.demo.member.infrastructure.controller.rq;

import lombok.Data;

@Data
public class CreateMemberRequest {
    private String name;
    private Integer age;
    private String email;
    private String phone;
}
