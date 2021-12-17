package excercise.model;

import excercise.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Student A", 21, "Male", "12A"));
        students.add(new Student(1, "Student B", 21, "Female", "12B"));
        students.add(new Student(1, "Student C", 21, "Male", "12C"));
        students.add(new Student(1, "Student D", 21, "Female", "12A"));
        students.add(new Student(1, "Student E", 21, "Male", "12C"));
        students.add(new Student(1, "Student F", 21, "Female", "12B"));
        students.add(new Student(1, "Student G", 21, "Male", "12B"));
        students.add(new Student(1, "Student H", 21, "Female", "12A"));

        return students;
    }
}
