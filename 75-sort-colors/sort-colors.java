// class Solution {
//     public static void swap(int[] nums , int i , int j)
//     {
//         int temp = nums[i] ;
//         nums[i] = nums[j] ;
//         nums[j] = temp ;
//     }
//     public void sortColors(int[] nums) {
        
//         int n = nums.length ;
//         int Zero = 0 , One = 0 , Two = n-1 ;

//         while(One <= Two)
//         {
//             if(nums[One] == 0)
//             {
//                 swap(nums, One , Zero) ;
//                 One++ ;
//                 Zero++ ;
//             }
//             else if(nums[One] == 2)
//             {
//                 swap(nums,One,Two) ;
//                 Two-- ;
//             }
//             else
//             {
//                 One++ ;
//             }
//         }
//     }
// }

class Solution {
  public void sortColors(int[] nums) {
    int zero = -1;
    int one = -1;
    int two = -1;

    for (final int num : nums)
      if (num == 0) {
        nums[++two] = 2;
        nums[++one] = 1;
        nums[++zero] = 0;
      } else if (num == 1) {
        nums[++two] = 2;
        nums[++one] = 1;
      } else {
        nums[++two] = 2;
      }
  }
}