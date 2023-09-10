package org.example;

public class GetPercentOfEmployedStudent {
  public double getPercentOfEmployedStudent(Student[] studentsInfo) {
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
    double res = employedQuantity / studentsQuantity;
    return res;
  }
}