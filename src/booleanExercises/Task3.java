package booleanExercises;/*
"blueTicket"

You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more
than either bc or ac sums, the result is 5. Otherwise the result is 0.

*/

public class Task3 {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        int c = 0;

        int d = a + b;
        int e = b + c;
        int f = a + c;

        if(d == 10 || e == 10 || f == 10 ){
            System.out.println("Resultado = 10");
        }
        else if(d == (e + 10) || d == (f + 10)){
            System.out.println("Resultado = 5");
        }
        else{
            System.out.println("Resultado = 0");
        }
    }
}
