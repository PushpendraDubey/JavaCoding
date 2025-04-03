package Random_Questions;
public class Count_digits {
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            if(rem != 0){
                int rem2 = n%rem;
                if( rem2 == 0){
                    count++;
                }
            }
            temp = temp/10;
        }
        return count;
    }
    public static void main(String [] args){
        int n = 660;
        int result = countDigits(n);
        System.out.println(result);
    }
}