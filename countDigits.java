public class Solution {
    public static int countDigits(int n){
        // Write your code here.
         int temp = n, count=0;
            while(temp>0){
            int rem = temp%10;
            if(rem!=0 && n%rem==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}
