package Session_06_Inheritance;

public class Student extends Person {
    private String classRoom;
    private int mark;

    public Student() {
    }

    public Student(String name, int age, Boolean gender, String class_room, int mark) {
        super(name, age, gender);
        this.classRoom = class_room;
        this.mark = mark;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public void eat() {
        System.out.println("Student thì ăn cơm bụi");
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
