// Q: find minimum in rotated sorted array

class Solution {
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];

    }
}