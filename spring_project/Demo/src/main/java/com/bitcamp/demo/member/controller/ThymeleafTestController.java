package com.bitcamp.demo.member.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bitcamp.demo.member.domain.User;

@Controller
public class ThymeleafTestController {

	public String getList(Model model) {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			users.add(new User("kkaok" + i, "테스트" + i, "web"));
		}
		User user = new User("테스트ID", "테스터", "web");
		model.addAttribute("user", user);
		model.addAttribute("users", users);
		model.addAttribute("today", new Date());
		model.addAttribute("content", "<div><span style='font-size:20px'>Hello World</span></div>");
		return "users";
	}

}
