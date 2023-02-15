/*
"teenSum"

Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
are extra lucky. So if either value is a teen, just return 19.
*/

public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a + b;

        if (a >= 13 && a <= 19) {
            System.out.println("Edad = 19");
        } else if (b >= 13 && b <= 19) {
            System.out.println("Edad = 19");
        }
        else{
            System.out.println("Edad = " + c);
        }
    }
}
