import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudentToDB(Student stu){
        Boolean  succ = false;
        try {
            Connection con = CreateConnetion.createConn();
            String q = "insert into students(sname, sphone, scity) values(?, ?, ?)";

            // Preparendstatement
            PreparedStatement psmet = con.prepareStatement(q);
            psmet.setString(1,stu.getStudentName());
            psmet.setString(2,stu.getStudentPhone());
            psmet.setString(3,stu.getStudentCity());

            psmet.executeUpdate();
            succ = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return succ;
    }

    public static boolean deleteStudent(int stuID){
        Boolean  succ = false;
        try {
            Connection con = CreateConnetion.createConn();
            String q = "delete from students where sid = ?";

            // Preparendstatement
            PreparedStatement psmet = con.prepareStatement(q);
            psmet.setInt(1,stuID);

            psmet.executeUpdate();
            succ = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return succ;
    }

    public static void showAllStudent(){
        try {
            Connection con = CreateConnetion.createConn();
            String q = "select * from students";

            Statement stmt = con.createStatement();
            ResultSet st = stmt.executeQuery(q);

            while(st.next()){
                int stuId = st.getInt(1);
                String name = st.getString(2);
                String phone = st.getString(3);
                String city = st.getString(4);
                Student stu = new Student(stuId, name, phone,city);
                stu.print();
            }
            System.out.println("----------------------------------------");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean updateStudent(Student stu,int stuID){
        Boolean succ = false;
        try {
            Connection con = CreateConnetion.createConn();
            String q = "UPDATE students SET sname = ?, sphone = ?, scity = ? WHERE sid = ?";

            // Preparendstatement
            PreparedStatement psmet = con.prepareStatement(q);
            psmet.setString(1,stu.getStudentName());
            psmet.setString(2,stu.getStudentPhone());
            psmet.setString(3,stu.getStudentCity());
            psmet.setInt(4, stuID);
            psmet.executeUpdate();
            succ = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return succ;
    }


}
