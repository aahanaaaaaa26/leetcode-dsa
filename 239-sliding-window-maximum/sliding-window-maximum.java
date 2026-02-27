class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int count = 0;
        int i = 0;
        int j = 0;
        int n = nums.length;

        int[] ans = new int[n - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        if (n == 1 || k == 1) return nums;

        while (j < n) {
            // add element
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            // shrink window
            if (j - i + 1 > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }

            // when window size == k
            if (j - i + 1 == k) {
                ans[count] = map.lastKey(); // maximum element
                count++;
            }

            j++;
        }

        return ans;
    }
}
        
