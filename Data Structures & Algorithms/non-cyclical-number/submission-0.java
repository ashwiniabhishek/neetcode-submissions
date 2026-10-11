class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            n = squareSum(n);
        }
        if (seen.contains(1)) {
            return true;
        }
        return false;
    }

    public int squareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            sum += (digit*digit);
        }
        return sum;
    }
}
