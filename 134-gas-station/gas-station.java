class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int Totalgas = 0;
        int Totalcost = 0;
        int n = gas.length;
        for(int i = 0; i<n;i++){
            Totalcost += cost[i];
            Totalgas += gas[i];
        }
        if(Totalcost > Totalgas) return -1;
        int total = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                ans = i+1;
            }
        }
        return ans;
    }
}