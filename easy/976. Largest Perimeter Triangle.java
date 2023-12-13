// 976. Largest Perimeter Triangle


class Solution {
    public int largestPerimeter(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            if (a < b + c) {
                return a + b + c;
            }
        }

        return 0;
    }
}
