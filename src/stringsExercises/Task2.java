package stringsExercises;

import java.util.Scanner;

public class Task2 {
    /*   "helloName"
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
    * */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Enter a name = ");
        var name = String.valueOf(consola.nextLine());

        String hi = "Hello ";
        String charac = "!";

        System.out.println(hi + name + charac);

    }
}
