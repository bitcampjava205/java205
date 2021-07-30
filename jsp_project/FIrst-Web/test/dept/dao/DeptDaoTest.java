package dept.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dept.domain.Dept;
import jdbc.util.ConnectionProvider;

public class DeptDaoTest {

	private static DeptDao dao;
	Connection conn;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = DeptDao.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		conn = ConnectionProvider.getConnection();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = SQLIntegrityConstraintViolationException.class)
	public void testSelectByDeptno() throws SQLException {

		dao.insertDept(conn, new Dept(10, "test", "test"));

	}

}
