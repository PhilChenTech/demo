package com.nicenpc.demo.adapter.member.in.controller;

import lombok.Data;

@Data
public class CreateMemberRequest {
    private String name;
    private Integer age;
    private String email;
    private String phone;
}
