package org.StudentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;



    // constructor prompts user to enter student's name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student first name: \t");
        this.firstName= scanner.nextLine();

        System.out.println("Enter Student last name: \t");
        this.lastName= scanner.nextLine();

        System.out.println("1.Freshman\n2.Sophomore\n3.Junior\n4.Senior \nEnter Student class level: \t");
        this.gradeYear= scanner.nextInt();

        System.out.println(firstName + " " +lastName + " "+ gradeYear);
        // display student ID
        setStudentID();
        System.out.println("STUDENT ID: "+studentID);

    }

    // generate an ID
    private void setStudentID(){
        // grade year + id
        id++;
        studentID = gradeYear+""+id;
    }


    // Enroll in courses

    // view Balance

    // pay Tuition

    // Show Status
}
