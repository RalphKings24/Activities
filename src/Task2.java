/*
"in1To10"
Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is
true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner consola1 = new Scanner(System.in);

        System.out.println("Enter a int number = ");

        int a = Integer.parseInt(consola1.nextLine());

        if(a >= 1 && a < 10  || a >= 10 && a <= 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
