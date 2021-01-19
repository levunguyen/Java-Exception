package Session_09_Set_Stack_Queue;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String> listStringSet = new TreeSet<>();
//        listStringSet.add("Java");
//        listStringSet.add("Android");
//        listStringSet.add("PHP");
//        listStringSet.add("Java");
//        listStringSet.add("C#");
//        listStringSet.add("C++");
//        listStringSet.add("Python");
//
//        for (String str : listStringSet){
//            System.out.println(str);
//        }

        Set<Student> setStudent = new TreeSet<>();
        setStudent.add(new Student(1,"Trung",33));
        setStudent.add(new Student(2,"Trung2",33));
        setStudent.add(new Student(3,"Trung3",33));
        setStudent.add(new Student(4,"Trung4",33));
        setStudent.add(new Student(1,"Trung",33));
        setStudent.add(new Student(5,"Trung6",33));
        for (Student student : setStudent){
            System.out.println(student);
        }
    }
}
