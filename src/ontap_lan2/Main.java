package ontap_lan2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student(1,"Hoang"));
        students.add(new Student(2,"Van"));

        LinkedList<Student> list2 = (LinkedList<Student>) students.clone();
        list2.get(0).setName("Hoang 2");

        for (Student student : students){
            System.out.println(student);
        }
    }
}
