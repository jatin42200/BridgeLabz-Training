class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int si = 1, ei = x / 2, ans = 0;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (mid * mid == x) {
                return mid;
            } else if (mid <= x / mid) { // safer than mid*mid < x (avoids overflow)
                ans = mid;   // store possible answer
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return ans;
    }
}
