class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] sum = new int[2];
        int p1 = 0;
        for(int i = 0; i< nums.length-1; i++)
        {
            int p2 = p1+1;
            if(nums[p1] + nums[p2] == target)
               {
                   sum[0] = p1;
                   sum[1] = p2;
               }
            else 
            {
                while (p2 < nums.length-1)
                {
                    p2++;
                    if(nums[p1] + nums[p2] == target)
               {
                   sum[0] = p1;
                   sum[1] = p2;
               }
                }
                p1++;
            }
        }
        return sum;
    }
}