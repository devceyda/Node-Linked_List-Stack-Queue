package Q3;

//-----------------------------------------------------
// Title: Tester class
// Author: Ceyda/Kuşçuoğlu
// Description: This class tests the question 3 in assigment 1
//-----------------------------------------------------
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scan.next();
        // in here reading the file
        Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
        int rows = 4;
        int columns = 4;
        //in here creates 2d array
        int[][] arr = new int[rows][columns];
        //it assigns values into the 2d array
        while (sc.hasNextLine()) {
            for (int i = 0; i < arr.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        //creates new linked list
        LinkedList listMatrix = new LinkedList(rows, columns);
        //it assignes array into the linked list
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                listMatrix.insert(arr[i][j], i, j);
            }
        }
        // it checks the matrix type
        if (listMatrix.isType3Matrix()) {
            System.out.println("It is a type 3 matrix.");
        } else if (listMatrix.isType1Matrix()) {
            System.out.println("It is a type 1 matrix.");
        } else if (listMatrix.isType2Matrix()) {
            System.out.println("It is a type 2 matrix.");
        } else {
            System.out.println("It is not one of these types");
        }

    }
}
