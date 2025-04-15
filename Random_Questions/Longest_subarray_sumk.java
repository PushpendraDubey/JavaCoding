// Brute Force approach
package Random_Questions;

public class Longest_subarray_sumk{

    public static int longest_subarray(int arr[], int k){
        int subarray_length = 0;
        for(int i =  0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == k & subarray_length < j-i+1){
                    subarray_length = j-i+1;
                }
            }
        }
        return subarray_length;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,1,1,3};
        int k = 3;
        int size = longest_subarray(arr, k);
        System.out.println("Length of longest Subarray with sum k : "+size);
    }
}