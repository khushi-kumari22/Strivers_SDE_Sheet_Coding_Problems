//  Leaders in an array


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>ans=new ArrayList<Integer>();
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max) {
                max=arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}