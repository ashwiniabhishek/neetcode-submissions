class Solution {
    public int hammingWeight(int n) {
        int shiftedN = n;
        int count = 0;
        while (shiftedN != 0) {
            shiftedN &= (shiftedN - 1);
            count++;
            // this trick is called Brian Kernighan's algorithm, it makes the left most bit to zero and thus we complete the loop in number of bit cycles.
        }
        return count;
    }
}
