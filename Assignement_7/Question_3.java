package Connection_JDBC;
import java.sql.*;
public class Question_3 
{
	public static void main(String args[]) {
        try {
            // PostgreSQL connection details
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.17/cse_db24";
            String username = "24bcsh01";
            String password = "24bcsh01";

            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection established successfully...");
                
                Statement stmt = con.createStatement();

                // SQL query to insert two records directly
                String qry = "INSERT INTO student2 (roll_no, name, age, department, cgpa) VALUES " +
                             "(101, 'Johanesen', 20, 'CSE', 9.50), " +
                             "(102, 'Bobby', 21, 'IT', 8.8)";

                stmt.executeUpdate(qry);
                System.out.println("Two records inserted successfully.");

                // Close resources
                stmt.close();
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
	}

}
