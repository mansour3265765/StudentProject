package proj1;

import java.util.ArrayList;

public class RegistrationSystem {

    private ArrayList<Student> students;

    public RegistrationSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("ID already exists.");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (Student s : students) {
            s.displayInfo();
        }
    }

    public void updateStudentMark(int id, double newMark) {
        for (Student s : students) {
            if (s.getId() == id) {
                try {
                    s.updateMark(newMark);
                    System.out.println("Mark updated successfully.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }

        System.out.println("Student not found.");
    }
}