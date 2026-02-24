class Solution {
    public int longestOnes(int[] nums, int k) {
        //agar k 2 hai toh iska mtlb longest subarray mai tum maximum length of 1 ke liye max to max 2 zero ko 1 bnake longest subarray of 1 bna skte h....



        //gptttt
        int left = 0;
        int zeros = 0;
        int maxLen = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zeros++;          // 0 mila
            }

            while (zeros > k) {   // zyada 0 ho gaye
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;           // window chhoti karo
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

