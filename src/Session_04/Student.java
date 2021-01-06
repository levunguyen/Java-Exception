package Session_04;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int age;

    void learn() {
        System.out.println("Sinh viên học lập trình");
    }

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student (int age){
        this.age = age;
    }


    @Override
    public String toString() {
        return " sinh viên là: {" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1;
        student1= new Student(1, "Hữu Đức");
        System.out.println(student1.toString());
    }
}
