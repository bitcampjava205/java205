package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.op.member.domain.RegRequest;
import com.bitcamp.op.member.service.MemberService;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {
	
	@Autowired
	private MemberService memberRegService;

	@RequestMapping(method = RequestMethod.GET)
	public String regForm() {
		return "member/regForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String reg(
			//@ModelAttribute("regRequest") MemberRegRequest regRequest,
			RegRequest regRequest,
			HttpServletRequest request,
			Model model
			) {
		System.out.println(regRequest);
		
		//int result = 0;
		int result = memberRegService.memberReg(regRequest, request);
		
		model.addAttribute("result", result);
		
		String view = "member/reg" ;
		if(result == 1) {
			// 인텍스 페이지로 리다이렉트
			view = "redirect:/index";
		}
		return view;
	}
	
}




