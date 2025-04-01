import java.util.ArrayList;

public class MergeSort {
    static void merge(int [] arr,int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        ArrayList<Integer> result = new ArrayList<>();
        
        while(i<=mid && j<= high){
            if(arr[i]<=arr[j]){
                result.add(arr[i]);
                i++;
            } else {
                result.add(arr[j]);
                j++;
            }
        }
        while(i<= mid){
            result.add(arr[i]);
            i++;
        }
        while(j<=high){
            result.add(arr[j]);
            j++;
        }
        for(int k = low; k<= high; k++){
            arr[k] = result.get(k-low);
        }
    }

    static void mergeSort(int [] arr, int low, int high){
        if(high<=low){
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, 0, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {6,4,5,2,3,1};
        int size = arr.length;
        System.out.println("Array before sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        mergeSort(arr, 0, size-1);

        System.out.println("Array after sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}