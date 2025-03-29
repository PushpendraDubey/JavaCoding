public class Bubble_sort_recursive {

    public static void bubbleSort(int [] arr, int n){
        // If array has single element, it is sorted already.
        if(n == 1){
            return;
        }
        int swap_count = 0;
        for(int i = 0; i<n-1; i++){ 
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

                swap_count++;
            }
        }
        // If swap count is 0, that means the array is already sorted.
        if(swap_count == 0){
            return;
        }
        bubbleSort(arr,n-1);
    }
    public static void main(String [] args){
        int [] arr = {7,3,9,6,2};
        int n = arr.length;

        bubbleSort(arr,n);
        System.out.println("Sorted Array : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(',');
            }
        }
    } 
}
