import java.util.Scanner;

public class StudentManagement {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.println("STUDENT MANAGEMENT SYSTEM");

    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    System.out.print("Enter register number: ");
    String regNo = scanner.nextLine();

    System.out.print("Enter mark: ");
    int mark = scanner.nextInt();

    System.out.println("Student Name: " + name);
    System.out.println("Register Number: " + regNo);
    System.out.println("Mark: " + mark);

    if (mark >= 50) {
        System.out.println("Result: PASS");
    } else {
        System.out.println("Result: FAIL");
    }

    scanner.close();
}

}
