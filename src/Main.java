import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[3];
  numbers[0] = 1;
  numbers [1] = 2;
  numbers [2] = 3;
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            if(i==0) {
                System.out.print(numbers[i]);
            }else {
                System.out.print(numbers[i]+",");
            }

        }
        System.out.println();


  float [] length = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(length));

        for (int i = 0; i < length.length; i++) {
            if (i==length.length-1){
                System.out.print(length[i]);
            }else {
                System.out.print(length[i]+",");
            }

        }
        System.out.println();
        for (int i = length.length-1; i >=0; i--) {
            if(i==0) {
                System.out.print(length[i]);
            }else{
                System.out.print(length[i]+",");
            }

        }
        System.out.println();

        int [] arr = new int [4];
        arr [0] = 15;
        arr [1]= 12;
        arr [2] = 17;
        arr [3] = 14;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");

            }
        }
            System.out.println();
            for (int i = arr.length-1; i >=0; i--) {
                if (i == 0) {
                    System.out.print(arr[i]);
                }else {
                    System.out.print(arr[i]+",");
                }

            }

            }

        }