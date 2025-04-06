// return list of all the prime numbers in an array
package Random_Questions;

import java.util.ArrayList;

public class Check_prime_numbers {
    public static ArrayList<Integer> checkPrime(int arr[], int n){
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int ele = arr[i];
            int count = 0;
            for(int j = 2; j<=ele/2; j++){
                if(ele%j == 0){
                    count++;
                }
            }
            if(count == 0){
                al.add(ele);
            }
        }
        return al;
    } 
    public static void main(String[] args) {
        int arr[] = {11,22,5,27,9};
        int n = arr.length;
        ArrayList<Integer> al = checkPrime(arr,n);
        System.out.println(al);
    }
}
