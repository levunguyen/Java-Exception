package Session_07;

import Session_06_Inheritance.Student;

import java.util.List;

public class TestGeneric implements CRUDInterface<Student> {

    @Override
    public void save() {
    }

    @Override
    public void update() {

    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
