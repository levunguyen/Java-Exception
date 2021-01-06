package Session_03;

public class Calculator {
    public static void sum(int num1, int num2){
        System.out.println("Gọi hàm return int");
    }

    public static double sum(double num1, double num2){
        System.out.println("Gọi hàm return double");

        return num1 + num2;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(4d,5));
    }
}
