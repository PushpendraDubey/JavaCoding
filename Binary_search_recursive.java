import java.util.*;

public class Binary_search_recursive {
    public int getIndex(int [] arr, int s, int e,int key){

        while(s<=e){
            int mid = s + (e-s)/2 ;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                return getIndex(arr, mid+1, e, key);
            } else {
                return getIndex(arr, s, mid-1, key);
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Please enter the elements of array : ");
        for(int i = 0; i<n; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i]);
        //     if (i < n - 1) {
        //         System.out.print(", ");
        //     }
        // }
        System.out.println("Please enter the key to search in array : ");
        int key = sc.nextInt();

        int s = 0;
        int e = n - 1;
        Binary_search_recursive ob = new Binary_search_recursive();
        int index = ob.getIndex(arr,s,e,key);

        if(index == -1 && key != -1){
            System.out.println("Element is Not present in the Array.");
        } else {
            System.out.println("Element is Present at index : " + index);
        }
        sc.close();
    }
}
