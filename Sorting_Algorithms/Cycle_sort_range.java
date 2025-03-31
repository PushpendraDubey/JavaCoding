// Given an array nums of n integers where nums[i] is in the range [1, n], 
// return an array of all the integers in the range [1, n] that do not appear in nums.

//This Cyclic sort algorithm will only work if the elements of array are in range 1,N or 0,N.
import java.util.*;

public class Cycle_sort_range {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int size = arr.length;
        int i = 0;
        List<Integer> li = new ArrayList<>();

        while(i<size){
            int correct_index = arr[i] - 1;
            if(arr[i] < size && arr[correct_index] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j = 0; j<size ; j++){
            if(arr[j]  != j + 1){
                li.add(j+1);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        // int arr [] = {8,3,2,7,4,2,3,1};
        int arr [] = {6,4,3,2,1};
        List<Integer> li = new ArrayList<>();
        li = findDisappearedNumbers(arr);
        System.out.println(li);
    }
}
