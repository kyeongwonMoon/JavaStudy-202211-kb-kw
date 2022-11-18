package j09_접근지정자.캡슐화;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student("김XX", "남");
        s1.printInfo();

        s1.setName("김XY");
        s1.printInfo();

        s1.gender = "여";
        s1.printInfo();
        System.out.println(s1.gender);

        System.out.println(s1.getName());

        Student2 s2 = new Student2("XX대학교", "문XX", 4, true);

        s2.printInfo();

        System.out.println(s2.getName());
        System.out.println(s2.getYear());
    }
}
