class Solution {

    public static int Solve(int[] nums , int i , int[] dp)
    {
        if(i >= nums.length) return 0 ;

        if(dp[i] != -1) // computation ho chuka hai
        {
            return dp[i] ;
        }
//take current element
        int take = nums[i] + Solve(nums,i+2,dp) ;
        // skip element
        int skip = Solve(nums,i+1,dp) ;
        dp[i] = Math.max(skip,take) ;
        return dp[i] ;
    }
    public int rob(int[] nums) {

        int n = nums.length ;
        int[] dp = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            dp[i] = -1 ;
        }
        return Solve(nums,0,dp) ;

    }
}