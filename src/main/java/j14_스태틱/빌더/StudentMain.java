package j14_스태틱.빌더;

public class StudentMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("김**")
                .address("부산")
                .build();

        System.out.println(student);


    }
}
