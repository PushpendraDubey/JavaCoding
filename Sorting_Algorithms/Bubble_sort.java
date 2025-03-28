public class Bubble_sort {

    public void bubbleSort(int [] arr, int n){
        // If array has single element, it is sorted already.
        if(n == 1){
            return;
        }

        for(int i = 0; i<n-1; i++){
            int swap_count = 0;

            for(int j = 0; j< n - 1 - i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap_count++;
                }
            }
            // If swap count is 0, that means the array is already sorted.
            if(swap_count == 0){
                return;
            }
        }
    }
    public static void main(String [] args){
        int [] arr = {7,3,9,6,2};
        int n = arr.length;

        Bubble_sort obj = new Bubble_sort();
        obj.bubbleSort(arr,n);
        System.out.println("Sorted Array : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(',');
            }
        }
    } 
}
