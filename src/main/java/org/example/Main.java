package org.example;


public class Main {
    public static void main(String[] args) {
        Student[] studentsInfo;

        Student alina = new Student();
        alina.firstName = "Alina";
        alina.lastName = "Ivanova";
        alina.age = 30;
        alina.isEmployed = true;

        Student dima = new Student();
        dima.firstName = "Dima";
        dima.lastName = "Ivanova";
        dima.age = 32;
        dima.isEmployed = false;

        Student nik = new Student();
        nik.firstName = "Nik";
        nik.lastName = "Ivanova";
        nik.age = 32;
        nik.isEmployed = true;

        studentsInfo = new Student[]{alina, dima};
        System.out.println(getPercentOfEmployedStudent(studentsInfo));
    }

    public static double getPercentOfEmployedStudent(Student[] studentsInfo) {
        // Write code below this line
        int studentsQuantity = 0;
        int employedQuantity = 0;
        for(Student s : studentsInfo) {
            if(s.age >= 30 && s.age <= 40) {
                if(s.isEmployed == true) {
                    employedQuantity++;
                }
                studentsQuantity++;

            }
        }
        System.out.println(studentsQuantity);
        System.out.println(employedQuantity);
        double res = (double) employedQuantity / studentsQuantity;
        return res;
    }
}
class Student {
    String firstName;
    String lastName;
    int age;
    boolean isEmployed;
}