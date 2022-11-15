package j06_반복;

public class Loop1 {

    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++){
            System.out.print(i);
            if(i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print(i + n);
            if(i < 9 ){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.print(n - i);
            if(i < n - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.print(2*n - i);
            if(i < n - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0, j = n; i < n; i++,j--){
            System.out.print("i: " + i);
            System.out.print(", ");
            System.out.print("j: " + j);
            if (i < n - 1){
                System.out.print(", ");
            }

        }

    }
}
