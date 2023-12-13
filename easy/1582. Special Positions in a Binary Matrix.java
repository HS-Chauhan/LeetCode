// 1582. Special Positions in a Binary Matrix


class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    int rowSum = 0;
                    int colSum = 0;

                    for (int k = 0; k < n; k++) {
                        rowSum += mat[i][k];
                    }

                    for (int k = 0; k < m; k++) {
                        colSum += mat[k][j];
                    }

                    if (rowSum == 1 && colSum == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
