//https://leetcode.com/problems/sort-an-array/
class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int s, int e) {
        if (s >= e)
            return;

        int randomIdx = rand.nextInt(e - s + 1) + s;
        swap(nums, s, randomIdx);

        int n = nums.length;
        int p1 = s + 1;
        int p2 = e;

        while (p1 <= p2) {
            if (nums[s] > nums[p1]) {
                p1++;
            } else if (nums[s] < nums[p2]) {
                p2--;
            } else {
                swap(nums, p1, p2);
                p1++;
                p2--;
            }
        }

        swap(nums, s, p2);

        quickSort(nums, s, p2 - 1);
        quickSort(nums, p2 + 1, e);
    }

    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}