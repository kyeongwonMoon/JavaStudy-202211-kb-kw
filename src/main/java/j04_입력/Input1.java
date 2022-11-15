package j04_입력;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {

        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " + address);

        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        age = scanner.nextInt();
        scanner.nextLine();
        phone = scanner.nextLine();
        address = scanner.nextLine();

//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
//        Scanner sc4 = new Scanner(System.in);
//
//        name = sc1.nextLine();
//        age = sc2.nextInt();
//        phone = sc3.nextLine();
//        address = sc4.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " + address);

    }

}
