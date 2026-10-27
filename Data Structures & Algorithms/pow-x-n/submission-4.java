class Solution {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return myPowPlus(x,n);
        } else {
            // I cannot negate the n because it can result in integer overflow and unexpected results
            return myPowMinus(x,n);
        }
    }

    public double myPowPlus(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n % 2 == 0) {
            double temp = myPow(x, n / 2);
            return  temp * temp;
        } else {
            double temp = myPow(x, (n - 1) / 2);
            return temp * temp * x;
        }
    }
    public double myPowMinus(double x, int n) {
        if (n == -1) {
            return 1/x;
        } else if (n % 2 == 0) {
            double temp = myPow(x, n / 2);
            return  temp * temp;
        } else {
            double temp = myPow(x, (n + 1) / 2);
            return  temp * temp * (1 / x);
        }
    }
}
