package com.nicenpc.demo.member.infrastructure.controller;

import com.nicenpc.demo.member.application.create.CreateMemberApplicationService;
import com.nicenpc.demo.member.application.update.UpdateMemberApplicationService;
import com.nicenpc.demo.member.infrastructure.controller.request.CreateMemberRequest;
import com.nicenpc.demo.member.infrastructure.controller.request.UpdateMemberRequest;
import com.nicenpc.demo.member.application.create.CreateMemberCommand;
import com.nicenpc.demo.member.application.update.UpdateMemberCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {
    private final CreateMemberApplicationService createMemberCommandApplicationService;
    private final UpdateMemberApplicationService updateMemberCommandApplicationService;

    @PostMapping
    public ResponseEntity<Long> createMember(@RequestBody CreateMemberRequest createMemberRequest) {
        CreateMemberCommand createMemberCommand = new CreateMemberCommand();
        createMemberCommand.setName(createMemberRequest.getName());
        createMemberCommand.setAge(createMemberRequest.getAge());
        createMemberCommand.setEmail(createMemberRequest.getEmail());
        createMemberCommand.setPhone(createMemberRequest.getPhone());
        Long result = createMemberCommandApplicationService.execute(createMemberCommand);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Long> updateMember(@PathVariable("id") Long id, @RequestBody UpdateMemberRequest updateMemberRequest) {
        UpdateMemberCommand updateMemberCommand = new UpdateMemberCommand();
        updateMemberCommand.setId(id);
        updateMemberCommand.setName(updateMemberRequest.getName());
        updateMemberCommandApplicationService.execute(updateMemberCommand);
        return ResponseEntity.ok().build();
    }
}
