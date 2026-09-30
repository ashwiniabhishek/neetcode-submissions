class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int newM = m;
        int newN = n;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; newM >= 1 && newN >= 1; i++) {
            leftToRight(ans, i, n - 1 - i, i, matrix);
            topToBottom(ans, 1 + i, m - 1 - i, n - 1 - i, matrix);
            if (newM != 1) {
                rightToLeft(ans, n - 2 - i, i, m - 1 - i, matrix);
            }
            if (newN != 1) {
                bottomToTop(ans, m - 2 - i, 1 + i, i, matrix);
            }
            
            newM-=2;
            newN-=2;
        }
        return ans;
    }

    public void leftToRight(List<Integer> ans, int left, int right, int row, int[][] matrix) {
        for (int i = left; i <= right; i++) {
            ans.add(matrix[row][i]);
        }
    }

    public void rightToLeft(List<Integer> ans, int right, int left, int row, int[][] matrix) {
        for (int i = right; i >= left; i--) {
            ans.add(matrix[row][i]);
        }
    }

    public void topToBottom(List<Integer> ans, int top, int bottom, int column, int[][] matrix) {
        for (int i = top; i <= bottom; i++) {
            ans.add(matrix[i][column]);
        }
    }

    public void bottomToTop(List<Integer> ans, int bottom, int top, int column, int[][] matrix) {
        for (int i = bottom; i >= top; i--) {
            ans.add(matrix[i][column]);
        }
    }
}
