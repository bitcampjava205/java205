package com.bitcamp.op.member.service;

import javax.servlet.http.HttpServletRequest;

import com.bitcamp.op.member.domain.RegRequest;

public interface MemberService {
	public int memberReg(RegRequest regRequest, HttpServletRequest request);
}
