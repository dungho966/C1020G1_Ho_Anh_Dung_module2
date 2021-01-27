package repository.impl;

import bean.Student;
import repository.StudentRepository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Integer , Student> studentMap = new TreeMap<>();

    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
