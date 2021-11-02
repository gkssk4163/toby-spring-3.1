package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao {
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// D사 Connection 정보 기입
		return null;
	}
}
