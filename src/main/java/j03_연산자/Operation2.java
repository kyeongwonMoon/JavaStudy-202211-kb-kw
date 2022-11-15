package j03_연산자;

public class Operation2 {

    public static void main(String[] args) {

        int num =10;
        num = num + 1;

//      ++num -> 현재 num 값에 +1
//      num++ -> 다음 num 값에 +1

        System.out.println(num++);
        System.out.println(num);

    }
}
