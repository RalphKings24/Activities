package booleanExercises;/*
"sortaSum"
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
so in that case just return 20.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){

        Scanner consola1 = new Scanner(System.in);
        System.out.println("Enter a int number = ");
        int a = Integer.parseInt(consola1.nextLine());

        Scanner consola2 = new Scanner(System.in);
        System.out.println("Enter other int number = ");
        int b = Integer.parseInt(consola2.nextLine());
        var c = a + b;

        if( c >= 10 && c <= 19) {
            System.out.println("Result = 20");
        }
        else {
            System.out.println("Sum = " + c);
        }
    }
}
