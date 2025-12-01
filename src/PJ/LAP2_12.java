package PJ;

import java.util.Scanner;

class Course {
    String courseId;
    String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class StudentRecord {
    String studentName;
    Course enrolledCourse;

    public StudentRecord(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

public class LAP2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String courseId = sc.nextLine();
        String courseName = sc.nextLine();
        String studentName = sc.nextLine();

        Course course = new Course(courseId, courseName);
        StudentRecord student = new StudentRecord(studentName, course);

        student.displayEnrollment();
    }
}
