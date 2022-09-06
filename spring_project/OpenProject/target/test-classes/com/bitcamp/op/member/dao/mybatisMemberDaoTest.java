package com.bitcamp.op.member.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.op.member.domain.Member;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class mybatisMemberDaoTest {

	@Autowired
	mybatisMemberDao dao;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testInsertMember() {
		Member memeber = new Member(0, "MBC", "111", "MBC-FM", "starwars.png", null);
		assertEquals("객체 입력", 1, dao.insertMember(member));
	}

	@Test
	public void testInsertMember1() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByIdPw() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() {
		fail("Not yet implemented");
	}

}
