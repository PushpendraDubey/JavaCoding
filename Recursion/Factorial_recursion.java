package Recursion;

public class Factorial_recursion {
    public static void main(String args[]){
        int n = 5;
       int  factorial = fact(n);
       System.out.println("Factorial of number "+n+" is : "+factorial);
    }
    static int fact(int n){
        // Base Case
        if(n<=1){
            return 1;
        }

        return n * fact(n-1);
    }
}
