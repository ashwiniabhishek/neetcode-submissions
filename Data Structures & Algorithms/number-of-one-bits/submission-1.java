class Solution {
    public int hammingWeight(int n) {
        int shiftedN = n;
        int count = 0;
        while (shiftedN != 0) {
            if (shiftedN % 2 != 0) {
                count++;
            }
            shiftedN = shiftedN >> 1;
        }
        return count;
    }
}
