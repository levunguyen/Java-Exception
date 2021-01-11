package Session_06_Inheritance;

import Session_06_Inheritance.Person;

public class Teacher extends Person {
    private int salary;
    private String coachClass;

    public Teacher() {
    }

    public Teacher(String name, int age, Boolean gender, int salary, String coachClass) {
        super(name, age, gender);
        this.salary = salary;
        this.coachClass = coachClass;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCoachClass() {
        return coachClass;
    }

    public void setCoachClass(String coachClass) {
        this.coachClass = coachClass;
    }

    @Override
    public void eat() {
        System.out.println("Teacher ăn cơm tiệm");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", coachClass='" + coachClass + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
