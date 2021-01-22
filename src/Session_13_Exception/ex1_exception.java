package Session_13_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number;
        try{
            number = scanner.nextInt();
            System.out.println("Số đã nhập vào là: " + number);
        }catch (InputMismatchException e){
            System.out.println("Ban đang bị lỗi :" + e.getMessage());
        }finally {

        }

        /*Nếu người dùng nhập vào là String thì sẽ xảy ra lỗi
        */

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
