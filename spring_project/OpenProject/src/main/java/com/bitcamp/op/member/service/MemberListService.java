package com.bitcamp.op.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.Dao;
import com.bitcamp.op.member.domain.Member;

@Service
public class MemberListService {

	private Dao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public List<Member> getMemberList(){
		return template.getMapper(Dao.class).selectAll();
	}
}
