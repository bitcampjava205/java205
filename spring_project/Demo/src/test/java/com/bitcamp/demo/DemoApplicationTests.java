package com.bitcamp.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private DataSource dataSOurce;
	
	private Connection conn;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void testConnection() throws Exception {
		System.out.println(dataSOurce);
		conn = dataSOurce.getConnection();
		System.out.println(conn);
		conn.close();
	}

}
