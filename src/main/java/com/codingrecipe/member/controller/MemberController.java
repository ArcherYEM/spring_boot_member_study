package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDto;
import com.codingrecipe.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;

    // 롬복 에러로 인하여 하기 클래스 임의 추가
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDto memberDto){
        System.out.println("MemberController.save");
        System.out.println("memberDto = " + memberDto);

        return "index";
    }
}
