package me.iamdoky.purpledog.signUp.controller;

import lombok.RequiredArgsConstructor;
import me.iamdoky.purpledog.signUp.model.Member;
import me.iamdoky.purpledog.signUp.model.request.MemberRequest;
import me.iamdoky.purpledog.signUp.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping( value="/api/member" )
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity memberList( @RequestParam(required = false) String memberId ) {

        if ( memberId == null ) {
            return ResponseEntity.ok( memberService.memberList() );
        }

        return ResponseEntity.ok( memberService.memberView(memberId) );
    }

    @GetMapping("/list/{memberId}")
    public ResponseEntity<Member> memberView ( @PathVariable String memberId ) {
        return ResponseEntity.ok( memberService.memberView( memberId ));
    }

    @PostMapping("/create")
    public ResponseEntity<Member> memberCreate ( @RequestBody MemberRequest request ) {
        return ResponseEntity.ok( memberService.memberCreate( request ) );
    }

    @PatchMapping("/update/{memberId}")
    public ResponseEntity<Member> memberUpdate (@PathVariable("memberId") String memberId, @RequestBody MemberRequest request) {
        return ResponseEntity.ok( memberService.memberUpdate( memberId, request ));
    }

}
