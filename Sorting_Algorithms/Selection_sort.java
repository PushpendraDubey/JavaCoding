public class Selection_sort {

    public static void selectionSort(int [] arr, int n){
        for(int i = 0;i < n-1; i++){
            int min_index = i;

            for(int j = i; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return;
    }
    public static void main(String [] args){
        int [] arr = {4,5,3,1,2};
        int n = arr.length;
        selectionSort(arr, n);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
