package Session_01;

import Session_05.Teacher;

import java.util.Scanner;

public class HomeClass extends Teacher {

    void displayHome() {
        System.out.println(this.id);
    }

    void displayA(){
        System.out.println(this.id);
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vui long nhap 1 so: ");
//        int number = scanner.nextInt();
//        System.out.println("Bạn đã nhập số: " + number);
        Teacher teacher = new Teacher(1, "a");
//        System.out.println(teacher.id);
    }
}
