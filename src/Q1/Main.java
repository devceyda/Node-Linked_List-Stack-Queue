package Q1;

//-----------------------------------------------------
// Title: Tester class
// Author: Ceyda/Kuşçuoğlu
// Description: This class tests the question 1 in the assigment 1 
//-----------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Student> studentStack = new Stack<>(); //creates stack 
        LinkedList<Student> studentLinkedList = new LinkedList<>(); //creates linked list

        boolean checker = true; //this variable controls the while loop

        while (checker) {

            System.out.println("Choose an option:"
                    + "\n1) Create a student:"
                    + "\n2) Remove a student:"
                    + "\n3) Summarize all students:"
                    + "\n4) Exit:");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: //this case adds student to the stack and linked list

                    System.out.println("Enter the ID of the student.");
                    int id = sc.nextInt();
                    System.out.println("Enter the name of the student.");
                    String name = sc.next();
                    System.out.println("Enter the grade1 of the student.");
                    double grade1 = sc.nextDouble();
                    System.out.println("Enter the grade2 of the student.");
                    double grade2 = sc.nextDouble();
                    System.out.println("Enter the grade3 of the student.");
                    double grade3 = sc.nextDouble();

                    Student newStudent = new Student(id, name, grade1, grade2, grade3);

                    studentStack.push(newStudent);
                    studentLinkedList.add(newStudent);

                    // sorts linked list by students avarage grade

                    Node<Student> current = studentLinkedList.getHead();

                    while (current != null) {
                        Node<Student> currenNext = current.next;
                        while (currenNext != null) {
                            Student s1 = (Student) current.getData();
                            Student s2 = (Student) currenNext.getData();
                            if (s1.avarageGrade.compareTo(s2.avarageGrade) < 0) {
                                Student temp = (Student) current.data;
                                current.data = currenNext.data;
                                currenNext.data = temp;
                            }
                            currenNext = currenNext.next;
                        }
                        current = current.next;
                    }
                    break;

                case 2: //this case removes the student on the top of the stack and returns the data and prints it

                    if (studentStack.isEmpty()) {
                        System.out.println("No student in the class.");
                        break;
                    } else {
                        Student deletedStudent = (Student) studentStack.pop();
                        System.out.println(deletedStudent.name + "'s ID was " + deletedStudent.ID + ". His grades were "
                                + deletedStudent.grade1 + ", " + deletedStudent.grade2 + " and " + deletedStudent.grade3
                                + ". He was ranked " + ((studentLinkedList).indexOf(deletedStudent) + 1)
                                + " in the class.");
                        studentLinkedList.remove(deletedStudent);
                        break;
                    }
                case 3: //this case brings the students info into the stack and prints it

                    for (int i = 0; i < studentStack.getSize(); i++) {
                        Student student = (Student) studentStack.get(i);
                        System.out.println(
                                student.toString() + " He is ranked " + (studentLinkedList.indexOf(student) + 1)
                                        + " in the class.");
                    }
                    break;

                case 4://this case summerize all the students in the stack and close the system

                    for (int i = 0; i < studentStack.getSize(); i++) {
                        Student student = (Student) studentStack.get(i);
                        System.out.println(
                                student.toString() + " He is ranked " + (studentLinkedList.indexOf(student) + 1)
                                        + " in the class.");
                    }
                    checker = false;

                    break;

            }

        }
    }
}
