class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            // check karo required number pehle se hai ya nahi
            if (map.containsKey(need)) {return new int[] { map.get(need), i };
            }

            // current number store karo
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}