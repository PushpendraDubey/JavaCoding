package Recursion;

public class Count_zeros {
    public static void main(String[] args) {
        int n = 102040001;
        int c = 0;
        int count = countZeros(n,c);
        System.out.println("Number of Zeros in "+n+" are : "+count);
    }
    // static int countZeros(int n){
    //         return helper(n,0);
    // }
    static int countZeros(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return countZeros(n/10, c+1);
        }
        return countZeros(n/10,c);
    }
}
