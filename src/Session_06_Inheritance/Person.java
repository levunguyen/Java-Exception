package Session_06_Inheritance;

public abstract class Person {
    protected String name = "aa";
    protected int age;
    protected Boolean gender;

    public abstract void eat();

//    public void eat(int a) {
//        System.out.println("Con người ăn tạp");
////        return a;
//    }
//
//    public double eat(double b) {
//        System.out.println("Con người ăn tạp");
//        return b;
//    }
//
//    public boolean eat(boolean a) {
//        System.out.println("Con người ăn tạp");
//        return a;
//    }

    public Person() {
    }

    public Person(String name, int age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(int age) {
        this.age = age;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
