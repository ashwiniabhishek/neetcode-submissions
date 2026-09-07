class Solution {
    public int hammingWeight(int n) {
        int shiftedN = n;
        int count = 0;
        while (shiftedN != 0) {
            count += (shiftedN & 1);
            shiftedN = shiftedN >>> 1; // unsigned right shift. If any negative number is given and if I don't use unsigned right shift my algorithm will be stuck in infinite loop because right shifting will not shift the signed bit and the number will always be negative and never become zero.
        }
        return count;
    }
}
