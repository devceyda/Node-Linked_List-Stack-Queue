package Q1;

//-----------------------------------------------------
// Title: Student class
// Author: Ceyda/Kuşçuoğlu
// Description: This class holds the student information
//-----------------------------------------------------

public class Student {

    int ID; // this integer holds the student id
    String name; // this string holds the student name
    Double grade1; // this double holds the student grade1
    Double grade2; // this double holds the student grade2
    Double grade3; // this double holds the student grade3
    Double avarageGrade; // this double holds the student avarage grade

    public Student(int iD, String name, Double grade1, Double grade2, Double grade3) //--------------------------------------------------------
 // Summary: this constructor assigns values into the Student object.
 // Precondition: id is integer,name is String,grade1 is double,grade2 is double,grade3 is double.
 // Postcondition: assigns values into the Student object.
 //-------------------------------------------------------- 
 {
        this.ID = iD;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        avarageGrade = avarage_grade(grade1, grade2, grade3);

    }

    public double avarage_grade(double grade1, double grade2, double grade3)//--------------------------------------------------------
 // Summary: calculates avarage grade of the student .
 // Precondition: all grades are double
 // Postcondition: calculates avarage grade of the student according to given formula.
 //--------------------------------------------------------
 {
        this.avarageGrade = grade1 * 0.3 + grade2 * 0.2 + grade3 * 0.5;
        return grade1 * 0.3 + grade2 * 0.2 + grade3 * 0.5;
    }

    @Override
    public String toString() //--------------------------------------------------------
 // Summary: it prints the information of student
 // Precondition: returns String
 // Postcondition: it overrides toString method and gives information of student
 //--------------------------------------------------------
 {
        return (name + "'s ID is " + ID + ". His grades are " + grade1 + ", " + grade2 + " and " + grade3 + ".");
    }

}

