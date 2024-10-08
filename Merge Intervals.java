class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<int[]> merge = new ArrayList<>();
        int[] newinterval = intervals[0];
        for (int[] interval : intervals) {
            if (interval[0] <= newinterval[1]) {
                if (interval[1] > newinterval[1])
                    newinterval[1] = interval[1];
            } else {
                merge.add(newinterval);
                newinterval = interval;
            }
        }
        merge.add(newinterval);
        return merge.toArray(new int[merge.size()][]);
    }
}