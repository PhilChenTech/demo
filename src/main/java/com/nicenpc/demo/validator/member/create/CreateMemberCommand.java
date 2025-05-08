package com.nicenpc.demo.validator.member.create;

import lombok.Data;

@Data
public class CreateMemberCommand {
    private String name;
    private Integer age;
    private String email;
    private String phone;
}
