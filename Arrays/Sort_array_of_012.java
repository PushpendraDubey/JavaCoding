package Arrays;

class Sort_array_of_012 {
    public void sortColors(int[] arr) {
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
}
