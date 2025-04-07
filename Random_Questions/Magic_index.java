// magic index means, if arr[i] == i, i is a magic_index. 🤦‍♂️Funny Right?🤦‍♂️
package Random_Questions;

import java.util.ArrayList;

public class Magic_index {
    public static int magicIndex(ArrayList<Integer> al, int n) {
        // Write your code here
        int s = al.size();
        int magic_idx = -1;
        for(int i = 0;i<s; i++){
            if(al.get(i) == i){
                magic_idx = i;
            }
        }
        return magic_idx;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(-1);
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(5);
        int result = magicIndex(al, 0);
        System.out.println("Magic Index : "+result);
    }
}
