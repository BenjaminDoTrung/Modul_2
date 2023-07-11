package ThucHanh;

public class ClassStudent {
    private int rollno;
    private String name;
    private static String college  = "BBDIT";
    ClassStudent(int r, String Trung) {
        rollno = r;
        name = Trung;
    }
    static void setCollege() {
        college = "Codgyme";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
