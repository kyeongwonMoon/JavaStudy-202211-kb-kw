package j07_메소드;

public class Method1 {

    public static void method1(){
        return;
    }

    public static void method2(){
        System.out.println("메소드2 호출");

    }

    public static void method3(){
        return;
    }

    public static void main(String[] args) {
        method1();
        System.out.println("메소드1 호출 후 출력");
        method2();
        int result1 = 0;
    }

}
