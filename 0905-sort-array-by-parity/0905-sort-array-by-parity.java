class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Move left pointer forward if nums[left] is already even
            if (nums[left] % 2 == 0) {
                left++;
            } 
            // Move right pointer backward if nums[right] is already odd
            else if (nums[right] % 2 != 0) {
                right--;
            } 
            // If left is odd and right is even, swap them
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}