
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnetion {
    static Connection con;
    public static Connection createConn(){
        try{
            //1 - Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2 - Create the connection
            String url = "jdbc:mysql://localhost:3306/Student_m?useSSL=false&serverTimezone=UTC";  // Correct URL
            String user = "root";  // Your MySQL username
            String password = "Ashraf123@";  // Your MySQL password
            con = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
