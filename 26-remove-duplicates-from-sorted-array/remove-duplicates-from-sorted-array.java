// class Solution {
//     public int removeDuplicates(int[] nums) {
// //         int i =0 ;
// //         for (final int num : nums )
// //          if (i<1 || num > nums [i-1])
// //           nums [i++]= num;
// //         return i;

// //     }    
// // } 

class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (int val : set) {
            nums[i++] = val;
        }
        return i;
    }
}