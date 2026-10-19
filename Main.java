package proj1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RegistrationSystem system = new RegistrationSystem();

        int choice;

        do {
            System.out.println("\n=== Student Registration System ===");
            System.out.println("1. Add Undergraduate Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Update Student Mark");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {

                    case 1:
                    case 2:
                        System.out.print("Enter student name: ");
                        String name = input.nextLine();

                        System.out.print("Enter student ID: ");
                        int id = Integer.parseInt(input.nextLine());

                        System.out.print("Enter student mark: ");
                        double mark = Double.parseDouble(input.nextLine());

                        Student student;

                        if (choice == 1) {
                            student = new UndergradStudent(name, id, mark);
                        } else {
                            student = new GradStudent(name, id, mark);
                        }

                        system.addStudent(student);
                        break;

                    case 3:
                        system.displayStudents();
                        break;

                    case 4:
                        System.out.print("Enter student ID: ");
                        int searchId =
                            Integer.parseInt(input.nextLine());

                        System.out.print("Enter new mark: ");
                        double newMark =
                            Double.parseDouble(input.nextLine());

                        system.updateStudentMark(searchId, newMark);
                        break;

                    case 5:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = 0;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                choice = 0;
            }

        } while (choice != 5);

        input.close();
    }
}