package MyJDBCpack;
import java.sql.*;

public class JDBCConn {
	public static void main(String args[]) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");//load and register the driver....
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC1?useSSL=false","root","root");//establish connection to the mysql..
		System.out.println("connection Established");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
