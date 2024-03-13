package Q2;

//-----------------------------------------------------
// Title: Tester class
// Author: Ceyda/Kuşçuoğlu
// Description: This class tests the question 2 in assigment 1
//-----------------------------------------------------
import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String item)//--------------------------------------------------------
 // Summary: it checks whether given string is palindrome or not
 // Precondition: it takes parameter String for checks it 
 // Postcondition: it controls if given item is palindrome string or not
 //-------------------------------------------------------- 
 {

        Stack st = new Stack();
        Queue qu = new Queue(item.length());
        for (int i = 0; i < item.length(); i++) {
            st.push(item.charAt(i));
            qu.enqueue(item.charAt(i));
        }

        while (!st.isEmpty()) {
            if (st.pop() != qu.dequeue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String item = sc.next();
        //checks the taken input String palindrome or not
        if (isPalindrome(item)) {
            System.out.println("It is a palindrome string");
        } else {
            System.out.println("It is not a palindrome string");
        }

    }

}

