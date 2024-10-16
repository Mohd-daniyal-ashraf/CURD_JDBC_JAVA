import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ax*************************************");
            System.out.println("SELECT AN OPTION");
            System.out.println("*************************************");
            System.out.println("PRESS 1 : ADD STUDENT");
            System.out.println("PRESS 2 : DELETE STUDENT");
            System.out.println("PRESS 3 : DISPLAY ALL STUDENTS");
            System.out.println("PRESS 4 : UPDATE THE STUDENT");
            System.out.println("PRESS -1 : EXIT" + "\n");
            System.out.print("ENTER QUERY : ");

            int query = sc.nextInt();
            sc.nextLine();

            if (query == 1) {
                // Add student
                System.out.print("Enter the student name: ");
                String name = sc.nextLine();

                System.out.print("Enter the student phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter the student city: ");
                String city = sc.nextLine();

                Student stu = new Student(name, phone, city);

                Boolean status = StudentDao.insertStudentToDB(stu);
                if(status){
                    System.out.println("Added."+"\n");
                }else{
                    System.out.println("Not Added!");
                }

            }
            else if (query == 2) {
                // Delete student logic here
                System.out.print("Enter the student ID : ");
                int stuID = sc.nextInt();
                Boolean status = StudentDao.deleteStudent(stuID);
                if(status){
                    System.out.println("Deleted." +"\n");
                }else{
                    System.out.println("Not Deleted!" +"\n");
                }
            }
            else if (query == 3) {
                // Display all students logic here
                StudentDao.showAllStudent();
                System.out.println();
            }
            else if (query == 4) {
                // update student
                System.out.print("Enter the student id: ");
                int stuID = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter the new name: ");
                String name = sc.nextLine();

                System.out.print("Enter the new phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter the new city: ");
                String city = sc.nextLine();

                Student stu = new Student(name, phone, city);
                Boolean status = StudentDao.updateStudent(stu,stuID);
                if(status){
                    System.out.println("Updated."+"\n");
                }else{
                    System.out.println("Not Updated!");
                }

            }
            else if (query == -1) {
                break;  // Exit the loop
            }
            else {
                System.out.println("WRONG QUERY, TRY AGAIN!" +"\n");
            }
        }

        sc.close();
    }
}
