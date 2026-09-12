class Solution {
    public int getSum(int a, int b) {
        int c = 0;
        int ans = 0;
        int count = 0;
        boolean twoComplementAddition = (a < 0 || b < 0);
        for(int i = 0; i<32; i++) {
            ans |= (((a & 1) ^ (b & 1) ^ c)<<count);
            c = (a & 1 & b & 1) | (b & 1 & c & 1) | (a & 1 & c & 1);
            a>>>=1;
            b>>>=1;
            count++;
        }

        if (twoComplementAddition) {
            return ans;
        }
        ans|=(c<<count);
        return ans;
    }
}
