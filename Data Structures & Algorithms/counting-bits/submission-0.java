class Solution {
    public int[] countBits(int n) {
        int[] numberOfOnes = new int[n+1];
        for (int i = 0;i<=n;i++) {
            int currentNum = i;
            int count = 0;
            while (currentNum != 0) {
                currentNum &= (currentNum - 1);
                count++;
            }
            numberOfOnes[i] = count;
        }
        return numberOfOnes;
    }
}
