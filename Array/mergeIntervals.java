class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int[][] result = new int[n][2];

        int start = intervals[0][0];
        int end = intervals[0][1];

        int j = 0;

        for (int i = 1; i < n; i++) {

            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {

                result[j][0] = start;
                result[j][1] = end;
                j++;

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        result[j][0] = start;
        result[j][1] = end;
        j++;

        return Arrays.copyOf(result, j);
    }
}