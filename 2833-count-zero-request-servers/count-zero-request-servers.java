
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int l = logs.length;
        int k = queries.length;

        // Sort logs according to time
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        // Store query and original index
        int[][] q = new int[k][2];

        for(int i = 0; i < k; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        // Sort queries
        Arrays.sort(q, (a, b) -> a[0] - b[0]);

        int[] count = new int[n + 1];
        int[] ans = new int[k];

        int left = 0;
        int right = 0;
        int active = 0;

        for(int i = 0; i < k; i++) {

            int start = q[i][0] - x;
            int end = q[i][0];

            // Add logs inside the window from right
            while(right < l && logs[right][1] <= end) {

                int server = logs[right][0];

                if(count[server] == 0) {
                    active++;
                }

                count[server]++;
                right++;
            }

            // Remove logs outside the window from left
            while(left < right && logs[left][1] < start) {

                int server = logs[left][0];

                count[server]--;

                if(count[server] == 0) {
                    active--;
                }

                left++;
            }

            // Store answer at original query index
            ans[q[i][1]] = n - active;
        }

        return ans;
    }
}
