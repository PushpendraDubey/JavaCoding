import java.util.*;

public class Binary_search {
    public int getIndex(int [] arr, int n,int key){
        int s = 0;
        int e = n -1;

        while(s<=e){
            int mid = s + (e-s)/2 ;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                s = mid+1;
            } else {
                e = mid-1;
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

        Binary_search ob = new Binary_search();
        int index = ob.getIndex(arr,n,key);

        if(index == -1 && key != -1){
            System.out.println("Element is Not present in the Array.");
        } else {
            System.out.println("Element is Present at index : " + index);
        }
        sc.close();
    }
}
