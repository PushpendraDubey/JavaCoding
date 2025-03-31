package Recursion;

public class Fibonacci_number {
    public static void main(String[] args) {
        int number = fibo(6);
        System.out.println(number);
    }

    static int fibo(int n){
        // Base case if fibo(0) or fibo(1) is called
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
