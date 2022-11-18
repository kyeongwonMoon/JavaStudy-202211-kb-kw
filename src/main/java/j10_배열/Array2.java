package j10_배열;

public class Array2 {

    public static void main(String[] args) {
        /*
        names라는 배열을 생성하고
        임**,
        신**
        고**
        문**
        장**
        위의 값을 순서대로 대입한다.

        이름1 : 임**
        이름2 : 신**
        이름3 : 고**
        이름4 : 문**
        이름5 : 장**

         */

        String names[] = {"임**", "신**", "고**", "문**", "장**"};

        for (int i = 0; i < names.length; i++){
            System.out.println("이름" + (i + 1) + " : " +  names[i]);
        }

    }
}
