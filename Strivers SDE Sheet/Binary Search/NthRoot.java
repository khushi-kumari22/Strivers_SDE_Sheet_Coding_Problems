//  Q:  Find Nith root of M

public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int start = 1;
        int end = m;

        while(start<=end){
            int mid = start + (end-start)/2;
            int power = (int)Math.pow(mid,n);

            if(power == m){
                return mid;
            }
            else if(power > m){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
