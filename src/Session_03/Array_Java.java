package Session_03;

public class Array_Java {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6}; //Khai báo mảng
        int[] numbers; //Khai báo mảng
//        numbers = new int[5];
//        int[] number2 = numbers;
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 3;
//        numbers[4] = 3;
//        numbers[5] = 3;
//        for (int num : number2) {
//            System.out.println("phần tử của mảng + " + num);
//        }

        //Khai báo mảng 2 chiều
        String[][] cities = {{"Ha Noi, Sai Gon", "Da Nang"},{"Can Tho, Hue, Vinh"},{"Campuchia", "Lao", "Đông Timor"}};
        for (String[] city: cities) {
            for (String ct: city) {
                System.out.println(ct);

            }
        }
    }
}
