package Connection_JDBC;

import java.sql.*;
public class Question_5 
{
	public static void main(String args[])
	{
        String url = "jdbc:postgresql://192.168.1.17/cse_db24";
		String username="24bcsh01";
		String password="24bcsh01";
		try 
		{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM student2";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("------------------------------------------------------------");
            System.out.printf("%-10s %-20s %-5s %-15s %-5s\n", "Roll", "Name", "Age", "Dept", "CGPA");
            System.out.println("------------------------------------------------------------");

            while (rs.next()) 
            {
                System.out.printf("%-10d %-20s %-5d %-15s %-5.2f\n",
                        rs.getInt("roll_no"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("department"),
                        rs.getFloat("cgpa"));
            }
            System.out.println("------------------------------------------------------------");

            rs.close();
            stmt.close();
            con.close();
        } 
		catch (Exception e) {
        	
            System.out.println("Error: " + e.getMessage());
        }
	}

}
