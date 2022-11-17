package j08_클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student("부산대학교", "홍길동", 3, true);

        student1.showStudentInfo();

        Student student2 = new Student();

        student2.school = "부산대학교";
        student2.name = "XXX";
        student2.studentYear = 4;
        student2.gender = false;

        student2.showStudentInfo();
    }
}
