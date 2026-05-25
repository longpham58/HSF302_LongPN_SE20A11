package pnlong.example.service;

import pnlong.example.pojos.Student;

public class StudentServiceImpl implements StudentService {
    @Override
    public void save(Student student) {
        System.out.println("Saving student...");
    }

}
