public class Insertion_sort {

    public static void insertionSort(int [] arr, int n){
        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String [] args){
        int [] arr = {9,1,8,2,7,3,5,6};
        int n = arr.length;

        insertionSort(arr, n);

        for(int i : arr){
            System.out.print( i +" ");
        }
    }
}
