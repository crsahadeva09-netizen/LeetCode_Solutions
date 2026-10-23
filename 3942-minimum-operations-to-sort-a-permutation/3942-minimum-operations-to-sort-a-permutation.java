import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] != (nums[i - 1] + 1) % n)
                inc = false;

            if (nums[i] != (nums[i - 1] - 1 + n) % n)
                dec = false;
        }

        if (!inc && !dec)
            return -1;

        int[][] dist = new int[2][n];
        for (int[] row : dist)
            Arrays.fill(row, -1);

        Queue<Integer> q = new LinkedList<>();
        dist[0][0] = 0;
        q.offer(0);

        while (!q.isEmpty()) {
            int state = q.poll();
            int orientation = state / n;
            int k = state % n;
            int d = dist[orientation][k];

            int prevK = (k - 1 + n) % n;
            if (dist[orientation][prevK] == -1) {
                dist[orientation][prevK] = d + 1;
                q.offer(orientation * n + prevK);
            }

            int nextOrientation = 1 - orientation;
            int nextK = (n - k) % n;

            if (dist[nextOrientation][nextK] == -1) {
                dist[nextOrientation][nextK] = d + 1;
                q.offer(nextOrientation * n + nextK);
            }
        }

        int ans = Integer.MAX_VALUE;

        if (inc) {
            ans = Math.min(ans, dist[0][nums[0]]);
        }

        if (dec) {
            int k = (n - 1 - nums[0] + n) % n;
            ans = Math.min(ans, dist[1][k]);
        }

        return ans;
    }
}
