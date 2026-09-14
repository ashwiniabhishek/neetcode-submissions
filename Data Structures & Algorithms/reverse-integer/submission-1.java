class Solution {
    public int reverse(int x) {
        int ans = 0;
        int digit = 0;
        int threshold = Integer.MAX_VALUE/10;
        int threshold2 = Integer.MIN_VALUE/10;
        while (x!=0) {
            digit = (x % 10);
            x = x/10;
            ans = ans * 10 + digit;
            if (ans > threshold && x != 0) {
                System.out.println("1");
                return 0;
            }
            if (ans < threshold2 && x != 0) {
                System.out.println("2");
                System.out.println(ans);
                return 0;
            };
            if (ans == threshold) {
                System.out.println("3");
                digit = (x % 10);
                if (digit > 7) return 0;
            } 
            if (ans == threshold2) {
                System.out.println("4");
                digit = (x % 10);
                if (digit < -8) return 0;
            }
        }
        return ans;
    }
}
