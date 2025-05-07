package com.nicenpc.demo.adapter.member.in.controller;

import com.nicenpc.demo.domain.member.entity.MemberDomain;
import com.nicenpc.demo.domain.member.service.CreateMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {
    private final CreateMemberService createMemberService;

    @PostMapping
    public ResponseEntity<?> createMember(@RequestBody CreateMemberRequest createMemberRequest){
        MemberDomain memberDomain = new MemberDomain();
        memberDomain.setName(createMemberRequest.getName());
        memberDomain.setAge(createMemberRequest.getAge());
        memberDomain.setEmail(createMemberRequest.getEmail());
        memberDomain.setPhone(createMemberRequest.getPhone());
        createMemberService.createMember(memberDomain);
        return ResponseEntity.ok().build();
    }
}
