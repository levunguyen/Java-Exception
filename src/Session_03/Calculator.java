package Session_03;

public class Calculator {
    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Tổng của 2 số là: " + result);
    }

    public static double sum(double num1, double num2) {
        System.out.println("Gọi hàm return double");

        return num1 + num2;
    }

    public static void swap(int c, int d) {
        System.out.println("Giá trị của a trước khi thay đổi là: " + c);
        System.out.println("Giá trị của b  trước khi thay đổi là: " + d);
        int temp = c;
        c = d;
        d = temp;
        System.out.println("Giá trị của a sau khi thay đổi là: " + c);
        System.out.println("Giá trị của b  sau khi thay đổi là: " + d);
    }

    public static void swap(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }

    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.sum(10, 20);
        /**
         * sum(10,20)
         */

//        int a = 10; //sao chép giá trị 10
//        int b = 20; // sao chép giá trị 20
//        swap(a,b);
//        System.out.println("Giá trị của a sau khi gọi hàm là: " + a);
//        System.out.println("Giá trị của b sau khi gọi hàm là: " + b);
//        int[] arr = {5, 10};
//        swap(arr);
//        for (int num: arr) {
//            System.out.println(num);
//        }
    }
}
