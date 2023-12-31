//  Q:  Finf first and last position of an array:

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // First Occurrence
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                ans[0] = mid;
                end = mid - 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        // Last Occurrence
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                ans[1] = mid;
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}