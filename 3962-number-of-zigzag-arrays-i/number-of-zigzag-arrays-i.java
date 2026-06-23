class Solution {
    static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Length = 2 initialization
        for (int i = 0; i < m; i++) {
            up[i] = m - i - 1;   // choose larger value next
            down[i] = i;         // choose smaller value next
        }

        for (int len = 3; len <= n; len++) {
            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long suffix = 0;
            for (int i = m - 1; i >= 0; i--) {
                newUp[i] = suffix;
                suffix = (suffix + down[i]) % MOD;
            }

            long prefix = 0;
            for (int i = 0; i < m; i++) {
                newDown[i] = prefix;
                prefix = (prefix + up[i]) % MOD;
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}