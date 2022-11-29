package j10_배열;

public class Array4 {

    public static int cmpMin(int[] array1, int[] array2) {
        int min = 0;
        min = 100;
        boolean check = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++)
                while (true) {
                    if (array1[i] == array2[j]) {
                        int a = array1[i];
                        if (min < a) {
                            check = false;
                        }
                        if (check){
                            min = array1[i];
                        }
                    }
                    break;
                }
        }

        return min;


    }

    public static int cmpMax(int[] array1, int[] array2){
        int max = 0;
        boolean check = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++)
                while (true) {
                    if (array1[i] == array2[j]) {
                        int a = array1[i];
                        if (max > a) {
                            check = false;
                        }
                        if (check){
                            max = array1[i];
                        }
                    }
                    break;
                }
        }

        return max;
    }


    public static int cmpMax2(int[] array1, int[] array2){
        int max = 0;
        boolean check = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++)
                while (true) {
                    if (array1[i] != array2[j]) {
                        int a = array1[i];
                        int b = array2[j];
                        if(a > b){
                            if (max > a) {
                            check = false;
                        }
                            if (check){
                                max = array1[i];
                            }

                        } else {
                            if (max > b) {
                                check = false;
                            }
                            if (check){
                                max = array2[j];
                            }
                        }

                    }
                    break;
                }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중복된 값 중 최댓값
         */

        System.out.println(cmpMin(nums1, nums2));
        System.out.println(cmpMax(nums1, nums2));
        System.out.println(cmpMax2(nums1, nums2));

    }
}