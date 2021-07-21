package dept.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dept.domain.Dept;
import jdbc.util.JdbcUtil;

public class DeptDao {
	
	public List<Dept> getDeptList(Connection conn){
		
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Dept> list = null;
		
		
		try {
			
			stmt = conn.createStatement();
			
			String sql = "select * from dept";
			
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<Dept>();
			
			while(rs.next()) {
				list.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
		

		return list;


		
	}

}






