// Brute Force approach
package Random_Questions;

import java.util.HashMap;

public class Longest_subarray_sumk_optimal {

    public static int longest_subarray(int arr[], int k){
        int maxLen = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int sum = 0;
        for(int i =  0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum - k;
            if(hm.containsKey(rem)){
                maxLen = Math.max(maxLen,i - hm.get(rem));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,1,1,-1,-1,2,1,3};
        int k = 3;
        int size = longest_subarray(arr, k);
        System.out.println("Length of longest Subarray with sum k : "+size);
    }
}
