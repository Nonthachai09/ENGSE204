package PJ;

import java.util.Scanner;

class StudentDetails {
    String studentId;
    String name;

    public void displayInfo() {
        System.out.println(studentId + " " + name);
    }
}

public class LAP2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentId = sc.nextLine();
        String name = sc.nextLine();

        StudentDetails student = new StudentDetails();
        student.studentId = studentId;
        student.name = name;

        student.displayInfo();
    }
}
