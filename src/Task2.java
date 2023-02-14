/*
"twoAsOne"
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
*/

public class Task2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        if(a + b == c || b + c == a || a + c == b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
