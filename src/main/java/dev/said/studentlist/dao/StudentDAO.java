package dev.said.studentlist.dao;

import dev.said.studentlist.db.DataBase;
import dev.said.studentlist.domains.Student;

import java.util.List;

import static dev.said.studentlist.db.DataBase.students;

public class StudentDAO {

    private static StudentDAO instance;

    public static StudentDAO getInstance() {
        if (instance == null) {
            synchronized (DataBase.class) {
                if (instance == null) {
                    instance = new StudentDAO();
                }
            }
        }
        return instance;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void deleteStudent(Integer id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public void updateStudent(Student student) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                students.set(i, student);
            }
        }
    }

    public Student getStudentById(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
