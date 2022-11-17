package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {

        Phone iPone14 = new Phone();
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22");
        System.out.println(iPone14);
        System.out.println(galaxyS22);

        iPone14.company = "Apple";

        iPone14.printPhoneCompany();
        iPone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();

    }
}

/*

    Class : Student, StudentMain
    학생 정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender(성별 true = 남, false = 여)

    showStudentInfo(){
         학교명 : 부산대학교
         이름 : 홍길동
         학년 : 3
         성별 : 남
    }

 */
