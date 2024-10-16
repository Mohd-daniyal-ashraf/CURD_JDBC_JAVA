
public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public Student(int studentId, String studentName, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        super();
        this.studentCity = studentCity;
        this.studentPhone = studentPhone;
        this.studentName = studentName;
    }

    public Student() {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public void print() {
        System.out.println("----------------------------------------");
        System.out.print(studentId +"    ");
        System.out.print(studentName +"    ");
        System.out.print(studentPhone +"    ");
        System.out.println(studentCity +"    ");
    }
}
