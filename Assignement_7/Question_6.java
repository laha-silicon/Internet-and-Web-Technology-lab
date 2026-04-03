package Connection_JDBC;

import java.util.*;
import java.sql.*;
public class Question_6 
{
	public static void main(String args[])
	{
		
		try {
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.17/cse_db24";
            String username = "24bcsh01";
            String password = "24bcsh01";

            Scanner in = new Scanner(System.in);
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection established...");

                // Get input
                System.out.print("Enter Roll Number of the student to delete: ");
                int roll = in.nextInt();

                // SQL Query
                String qry = "DELETE FROM student WHERE roll_no = ?";
                PreparedStatement pstmt = con.prepareStatement(qry);

                // Set value
                pstmt.setInt(1, roll);

                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("Record deleted successfully.");
                } else {
                    System.out.println("No record found with Roll No: " + roll);
                }

                pstmt.close();
                con.close();
                in.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
