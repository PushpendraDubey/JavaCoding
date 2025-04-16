package Arrays;

class Sort_array_of_012 {
    public static void sortColors(int[] arr) {
        int size = arr.length;
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        for(int i = 0; i<size; i++){
            if(arr[i] == 0){
                zeros++;
            } else if (arr[i] == 1){
                ones++;
            } else {
                twos++;
            }
        }
        for(int i = 0; i<size; i++){
            if(i<zeros){
                arr[i] = 0;
            } else if (i< zeros + ones){
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
