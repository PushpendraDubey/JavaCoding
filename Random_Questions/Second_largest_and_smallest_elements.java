// Find the second largest and second smallest element from the array.
// Time complexity should be maximum O(n).
// Don't sort the array.

package Random_Questions;
import java.util.Arrays;

public class Second_largest_and_smallest_elements {
    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int high = 0;
        int result[] = new int[2];
        for(int i = 0; i<n; i++){
            if(arr[i]>high){
                high = arr[i];
            }
        }
        int high2 = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]>high2 && arr[i] != high){
                high2 = arr[i];
            }
        }
        int low = high;
        for(int j =0; j<n;j++){
            if(arr[j]<low){
                low = arr[j];
            }
        }
        int low2 = high;
        for(int j =0; j<n;j++){
            if(arr[j]<low2 && arr[j] != low){
                low2 = arr[j];
            }
        }
        result[0] = high2;
        result[1] = low2;

        return result;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,5,1,9,6};
        int n = arr.length;
        int result[] = getSecondOrderElements(n, arr);
        System.out.println(Arrays.toString(result));
        System.out.println("Second Highest Element : "+result[0]);
        System.out.println("Second Lowest Element : "+result[1]);
    }
}
