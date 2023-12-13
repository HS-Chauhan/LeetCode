// 2600. K Items With the Maximum Sum


class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int count = 0;
        int sum = 0;
        while(count < k){
            if(numOnes > 0){
                sum++;
                count++;
                numOnes--;
            }
            else if(numZeros > 0 && numOnes == 0){
                count++;
                numZeros--;
            }
            else{
                count++;
                numNegOnes--;
                sum--;
            }
        }
        return sum;
    }
}
