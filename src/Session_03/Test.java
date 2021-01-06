package Session_03;

public class Test {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        swap(a,b);
//        System.out.println(a);
//        System.out.println(b);
        int[] numbers = {5,10};
        swap(numbers);
        for (int num: numbers) {
            System.out.println(num);
        }
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(String a , String b){
        String temp = a;
        a = b;
        b = temp;
    }
    static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
