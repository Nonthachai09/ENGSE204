package PJ;

import java.util.Scanner;

class StudentData {
    String studentId;
    String name;
}

public class LAP2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentId = sc.nextLine();
        String name = sc.nextLine();

        StudentData student = new StudentData();
        student.studentId = studentId;
        student.name = name;

        System.out.println(student.studentId + " " + student.name);
    }
}
