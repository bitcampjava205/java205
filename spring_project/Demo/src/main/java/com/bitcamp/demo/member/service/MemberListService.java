package com.bitcamp.demo.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.demo.member.domain.Member;
import com.bitcamp.demo.member.domain.SearchType;
import com.bitcamp.demo.member.mapper.MemberDao;

@Service
public class MemberListService {

	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public List<Member> getMemberList(){
		return template.getMapper(MemberDao.class).selectAll();
	}

	public List<Member> getMemberList(SearchType searchType){
		return template.getMapper(MemberDao.class).selectMember(searchType);
	}
}
