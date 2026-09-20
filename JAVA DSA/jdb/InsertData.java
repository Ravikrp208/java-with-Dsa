import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "1234";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO students(name, age) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Rahul");
            ps.setInt(2, 20);

            int rows = ps.executeUpdate();
            System.out.println(rows + " Record Inserted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}