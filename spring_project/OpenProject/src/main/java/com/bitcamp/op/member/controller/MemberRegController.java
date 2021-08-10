package com.bitcamp.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {

	@RequestMapping(method = RequestMethod.GET)
	public String regForm() {
		return "member/regForm";
	}
	
}
