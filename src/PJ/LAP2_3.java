package PJ;

import java.util.Scanner;

class Student {
    String studentId;
    String name;
    static int studentCount = 0;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++;
    }
}

public class LAP2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String id = sc.next();
            String name = sc.next();
            new Student(id, name);
        }

        System.out.println(Student.studentCount);
        sc.close();
    }
}
