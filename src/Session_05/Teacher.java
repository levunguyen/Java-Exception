package Session_05;

import Session_01.HomeClass;

public class Teacher {
    private static String nameSchool = "CodeGym";
    protected int id;
    private String name;
    static String[] danh_sach_sinh_vien;

    static {
        System.out.println("Static chạy");
        danh_sach_sinh_vien = new String[3];
        danh_sach_sinh_vien[0] = "Hoàng";
        danh_sach_sinh_vien[1] = "Khánh";
        danh_sach_sinh_vien[2] = "Minh";
    }

    public Teacher() {
        this(5);
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher(int id) {
        this.id = id;
    }

    public Teacher(String name) {
        this.name = name;
    }

    protected int getId() {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void displayTeacher() {
        int i = 10;
        System.out.println(nameSchool);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Trung");
//        Teacher teacher2 = new Teacher(1, "Trung");
//        teacher2.nameSchool = "CodeGymDaNang";
//        System.out.println(Teacher.nameSchool);
        System.out.println("Hàm main chạy");
//        for (String sinhvien: danh_sach_sinh_vien) {
//            System.out.println(sinhvien);
//        }
    }

}
