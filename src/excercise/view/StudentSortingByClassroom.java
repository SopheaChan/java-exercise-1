package excercise.view;

import excercise.dto.Student;
import excercise.model.StudentList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentSortingByClassroom {

    private List<Student> getStudentByClassRoom(String classroom) {
        List<Student> studentData = new StudentList().getStudentList();

        List<Student> students = studentData.stream().filter(student -> student.getGrade().equals(classroom)).collect(Collectors.toList());

        return students;
    }

    private void displayStudentList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a classroom to view student list: ");
        String inputClassroom = scanner.nextLine();

        System.out.println("Classroom: " + inputClassroom);

        if (getStudentByClassRoom(inputClassroom).size() <= 0) {
            System.out.println("The classroom you are looking for is not available.");
        }

        for (Student student : getStudentByClassRoom(inputClassroom)) {
            System.out.println(student.toString());
        }

        System.out.println("Do you want to view the list of student from another classroom? ");
        System.out.print("Y/N: ");
        String userResponse = scanner.nextLine();

        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            displayStudentList();
        }
    }

    public static void main(String[] args) {
        new StudentSortingByClassroom().displayStudentList();
    }

}
