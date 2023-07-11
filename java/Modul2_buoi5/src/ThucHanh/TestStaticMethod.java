package ThucHanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        ClassStudent s1 = new ClassStudent(111, "Đức");
        ClassStudent s2 = new ClassStudent(222, "Bình");
        ClassStudent s3 = new ClassStudent(333, "Đăng");
        ClassStudent.setCollege();
        s1.display();
        s2.display();
        s3.display();
    }
}
