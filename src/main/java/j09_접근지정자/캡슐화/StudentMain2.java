package j09_접근지정자.캡슐화;

public class StudentMain2 {

    public static void main(String[] args) {

        Student2 s1 = new Student2("XX대학교", "문XX", 4, true);

        s1.printInfo();

        System.out.println(s1.getName());
        System.out.println(s1.getYear());
    }
}
