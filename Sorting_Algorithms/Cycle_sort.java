public class Cycle_sort{
    public static void cycleSort(int arr[]){
        int n = arr.length;

        for(int cycleStart = 0; cycleStart < n-1 ; cycleStart++){
            int pos = cycleStart;
            int item = arr[cycleStart];

            for(int i = cycleStart + 1; i<n ; i++ ){
                if(arr[i] < item){
                    pos++;
                }
            }
            if(pos == cycleStart){
                continue;
            }
            while(item == arr[pos]){
                pos++;
            }
            if(pos != cycleStart){
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
            //Rotate the cycle  to place the displaced elements
            while(pos != cycleStart){
                pos = cycleStart;
                for(int i = cycleStart+1; i<n; i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }
                while(item == arr[pos]){
                    pos++;
                }
                if(item != arr[pos]){
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr [] = {5,2,8,1,2,5,3};
        cycleSort(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}