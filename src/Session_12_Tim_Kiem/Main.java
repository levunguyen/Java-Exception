package Session_12_Tim_Kiem;

import java.util.Scanner;

public class Main {

    //Tìm kiếm tuyến tính
//    static int[] numbers = {4,5,2,7,9,10,40,20,59};
//    static Scanner input = new Scanner(System.in);
//
//
//    public static void main(String[] args) {
//        System.out.print("Nhập giá trị cần tìm kiếm: ");
//        int num = input.nextInt();
//        System.out.println(searchValue(numbers, num));
//    }
//
//    public static int searchValue(int[] arr, int value){
//        for (int i = 0; i< arr.length; i++){
//            if (value == arr[i]){
//               return i;
//            }
//        }
//        return -1;
//    }

    //Tìm kiếm nhị phân
    static int[] numbers = {4, 5, 7, 9, 10, 20, 59, 75, 89};


    public static void main(String[] args) {
        System.out.println(binarySearch(numbers, 40));
    }

    public static int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length -1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}


