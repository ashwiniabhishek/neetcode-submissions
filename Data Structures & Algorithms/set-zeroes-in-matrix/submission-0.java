class Solution {
    public void setZeroes(int[][] matrix) {
        Set columns = new HashSet();
        Set rows = new HashSet();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (matrix[i][j] == 0) {
                    columns.add(j);
                    rows.add(i);
                }
            }
        }

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (rows.contains(i) || columns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
