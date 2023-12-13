// 2427. Number of Common Factors


class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        int n = a < b ? a : b;

        for(int i = 2;i <= n; i++){
            if((a % i == 0) && (b % i == 0)){
                count++;
            }
        }
        return count;
    }
}
