package com.bitcamp.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.op.member.service.MemberListService;

@Controller
public class MemberListController {

	@Autowired
	private MemberListService listService ;
	
	@RequestMapping("/member/list")
	public String getList(Model model) {
		model.addAttribute("memberList", listService.getMemberList());
		return "member/list";
	}
	
}
