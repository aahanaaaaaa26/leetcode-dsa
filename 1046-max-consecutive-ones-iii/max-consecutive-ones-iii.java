class Solution {
    public int longestOnes(int[] nums, int k) {
        //agar k 2 hai toh iska mtlb longest subarray mai tum maximum length of 1 ke liye max to max 2 zero ko 1 bnake longest subarray of 1 bna skte h....
        int i=0;
        int j=0;
        int curr_sum=0;
        int n = nums.length;
        int ans=0;
        int zero=0;
        for(int a=0;a<n;a++){
            if(nums[a]==0){
                zero++;
            }
        }
        if (zero<k) return n;
        while(j<n){

            curr_sum+=nums[j];

            if(j-i+1 - curr_sum > k){
                curr_sum -= nums[i];
                i++;

            }
            else if (j-i+1-curr_sum==k){
                ans=Math.max(ans,j-i+1);
              

            }
              j++;
        }
        return ans;
      
    }
}

