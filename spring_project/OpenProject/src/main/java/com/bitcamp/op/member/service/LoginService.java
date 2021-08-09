package com.bitcamp.op.member.service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.MemberDao;

@Service
public class LoginService {

	@Autowired
	MemberDao dao;
	
	public boolean login(String id, String pw, String reid, HttpSession session, HttpServletResponse response) {
		
		boolean loginbChk = false;
		
		dao.login();
		
		return loginbChk;
	}
}
