package com.nicenpc.demo.member.application.update;

import lombok.Data;

@Data
public class UpdateMemberCommand {
    private Long id;
    private String name;
}
