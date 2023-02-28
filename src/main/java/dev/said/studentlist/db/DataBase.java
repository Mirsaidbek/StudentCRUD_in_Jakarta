package dev.said.studentlist.db;

import dev.said.studentlist.domains.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static DataBase instance;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (instance == null) {
            synchronized (DataBase.class) {
                if (instance == null) {
                    instance = new DataBase();
                }
            }
        }
        return instance;
    }

    public List<Student> students = new ArrayList<>();

    public void loadData() {
        students.add(Student.builder().
                id(1).
                firstName("John").
                lastName("Doe").
                age("20").
                major("Computer Science").
                phoneNumber("0555555555").
                build());
        students.add(Student.builder().
                id(2).
                firstName("Jack").
                lastName("Kirk").
                age("19").
                major("Law").
                phoneNumber("0555551234").
                build());
        students.add(Student.builder().
                id(3).
                firstName("Asus").
                lastName("Tag").
                age("23").
                major("Art").
                phoneNumber("0595777550").
                build());
        students.add(Student.builder().
                id(4).
                firstName("Zack").
                lastName("John").
                age("19").
                major("Computer Science").
                phoneNumber("231546870").
                build());
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
