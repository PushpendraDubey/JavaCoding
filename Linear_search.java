import java.util.*;

public class Linear_search {
    public int getIndex(int arr[],int n,int target){
        int index;

        for(int i =0; i<n; i++){
            if(arr[i] == target){
                index = i;
                return index;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        // int [] arr = {4,7,9,3,2,5,11};
        // int n = arr.length;
        // int key = 7;

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

        Linear_search ob = new Linear_search();
        int index = ob.getIndex(arr, n, key);

        if(index == -1 && key != -1){
            System.out.println("Element is Not present in the Array.");
        } else {
            System.out.println("Element is Present at index : " + index);
        }

        sc.close();
    }
}
