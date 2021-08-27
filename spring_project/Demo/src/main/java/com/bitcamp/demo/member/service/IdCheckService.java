package com.bitcamp.demo.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.demo.member.mapper.MemberDao;

@Service
public class IdCheckService {
	
//	@Autowired
//	MemberDao dao;
	
	//@Autowired
	//private JdbcTemplateMemberDao dao;
	
	//@Autowired
	//private mybatisMemberDao dao;
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public String idCheck(String id) {
		
		String result = "Y";
		//Connection conn = null;
		
		// 인터페이스의 메퍼 DAO 생성
		dao = template.getMapper(MemberDao.class);
		
		
		//conn = ConnectionProvider.getConnection();
		if(dao.selectById(id)>0) {
			result="N";
		}
		return result;
	}

}
