class Solution {
    public int hammingWeight(int n) {
        long shiftedN = n;
        shiftedN = shiftedN << 1;
        int count = 0;
        while (shiftedN != 0) {
            shiftedN = shiftedN >> 1;
            if (shiftedN % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
