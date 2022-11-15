package j06_반복;

public class Loop2 {

    public static void main(String[] args) {
        /*

                     2 X 1 = 2
                     2 X 2 = 4
                     2 X 3 = 6
                     . . .
                     2 X 9 = 18

         */

        int dan = 2;

        for(int i = 0; i < 10; i++){
            if(i == 0){
                System.out.println("[" + dan + "단" + "]");
            } else {
                System.out.println(dan + " X " + i + " = " + dan * i);
            }
        }

        for(int n = 0; n < 8; n++){
            for(int i = 0; i < 10; i++){
                if(i == 0){
                    System.out.println("[" + dan + "단" + "]");
                } else {
                    System.out.println(dan + " X " + i + " = " + dan * i);
                }
            }
            dan++;
            System.out.println();
        }

        }
    }

