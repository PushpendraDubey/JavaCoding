package Random_Questions;

public class Check_if_array_is_sorted {
    public static boolean isSorted(int n, int []arr) {
        // Write your code here.
        boolean flag = true;
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,9,5,6};
        boolean result = isSorted(arr.length, arr);
        System.out.println("Is array sorted?");
        System.out.println(result);
    }
}
