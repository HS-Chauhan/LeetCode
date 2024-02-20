// 268. Missing Number


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = n * (n + 1) / 2;
        for(int i : nums){
            sum -= i;
        }
            
        return sum;
    }
}

