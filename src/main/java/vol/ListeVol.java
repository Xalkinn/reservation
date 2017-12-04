package vol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ListeVol {
	static Connection conn = null;

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/reservation";

		try {
			conn = DriverManager.getConnection(url, "postgres", "postgres");

			Statement requette = conn.createStatement();

			requette.executeUpdate("SELECT *" + "FROM vol" + "ORDER BY date;");
			
			requette.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
