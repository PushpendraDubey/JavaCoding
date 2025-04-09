package Random_Questions;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_two_arrays{
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for(int i = 0; i< nums1.length; i++){
            hs.add(nums1[i]);
        }

        for(int i = 0; i<nums2.length; i++){
            if(hs.contains(nums2[i])){
                temp.add(nums2[i]);
            }
        }
        int [] arr = new int[temp.size()];
        int idx = 0;
        for(int i : temp){
            arr[idx] = i;
            idx++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,5};
        int nums2[] = {3,5,6,7};
        int []result = intersection(nums1, nums2);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
    
}