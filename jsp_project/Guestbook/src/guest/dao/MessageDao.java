package guest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import guest.domain.Message;
import guest.jdbc.JdbcUtil;

public class MessageDao {

	public int writeMessage(Connection conn, Message message) throws SQLException {

		int resultCnt = 0;
		PreparedStatement pstmt = null;

		String sql = "insert into guestbook_message (guestname, password, message) "
				    + "values (?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, message.getGuestname());
			pstmt.setString(2, message.getPassword());
			pstmt.setString(3, message.getMessage());
			resultCnt = pstmt.executeUpdate();
			
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;
	}

}