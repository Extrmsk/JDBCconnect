import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","87654321");
		Statement st = con.createStatement();
		String sql1 = "update customers set login='Elena' where login='Egor';";
		String sql2 = "select * from customers;";
		ResultSet rs = st.executeQuery(sql2);
		
		String a = null;
		String b = null;
		
		while (rs.next()) {
			a = rs.getString(1);
			b = rs.getString(2);
		}
		
		System.out.println(a + " " + b);
		

	}

}
