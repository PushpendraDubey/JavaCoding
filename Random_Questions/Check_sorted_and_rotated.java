package Random_Questions;

public class Check_sorted_and_rotated {
    public static boolean check(int[] arr) {
        boolean flag = false;
        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(count == 1){
            if(arr[arr.length-1] <= arr[0]){
                flag = true;
                System.out.println("Array Sorted and Rotated!");
            }
        }
        if(count == 0){
            flag = true;
            System.out.println("Array is sorted!");
        }
        return flag;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        boolean result = check(arr);
        System.out.println(result);
    }
}
