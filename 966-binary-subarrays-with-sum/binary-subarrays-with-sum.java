class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int n=nums.length;
        int curr_sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            curr_sum+=nums[i];

          if (map.containsKey(curr_sum-goal)){
            count+=map.get(curr_sum-goal);
        }
        map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
        }
        return count;  
    }
}