// Rotate array right by k steps - LeetCode
package Random_Questions;

public class Rotate_Array {
    // public static void rotate(int[] arr, int k) {
    //     int size = arr.length;
    //     int temp[] = new int[size];
    //     int j = 0;
    //     for(int i = size-k; i < size; i++){
    //         temp[j] = arr[i];
    //         j++;
    //     }
    //     System.out.println(j);
    //     for(int i = 0; i<size-k; i++){
    //         temp[j] = arr[i];
    //         j++;
    //     }
    //     for (int i : temp) {
    //         System.out.print(i+" ");
    //     }

    //     arr = temp;
    // }

    // BETTER APPROACH
    public static void rotate(int[] arr, int k) {
        int size = arr.length;
        k = k % size;

        reverseArray(arr, 0, size-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,size-1);
    }
    static void reverseArray(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 2;
        rotate(arr,k);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
