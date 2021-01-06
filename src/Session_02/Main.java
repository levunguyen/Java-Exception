package Session_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Vòng lặp for
         */
//        System.out.println("Input your number: ");
//        int number = scanner.nextInt();
//        int i = 0;
//        for (; ; ) {
//            if (i > number) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

        /**
         * Vòng lặp while
         */
//        System.out.println("Input your number: ");
//        int number = scanner.nextInt();
//        int i = 0;
//        while (i <= number){
//            System.out.println(i);
//            i++;
//        }

        /**
         * vòng lặp for-each
         */
        int[] numbers = {1, 23, 4, 5, 7, 8, 4, 2, 11};
        for (int num : numbers) {
            System.out.println(num);
        }

//        for (int i = 0; i <= numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
    }
}
