class Solution {
    public int reverseBits(int n) {
        int leftMostDigit = 0;
        int reversedNum = 0;
        for(int i = 0; i<32; i++) {
            reversedNum |= (n & 1);
            if (i != 31) {
                reversedNum <<=  1;
                n >>= 1;
            }
        }
        return reversedNum;
    }
}
