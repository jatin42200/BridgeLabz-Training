class Solution {
    public int missingNumber(int[] nums) {
         int n=nums.length;
         int f=1;
        int i=0;
          for(;i<=n&&f==1;i++)
          {
              for(int j=0;j<n;j++) 
              {
                if(nums[j]==i)
                {
                    f=1;
                    break;
                }
                f=0;
              }
              
          }

          return i;
         
    }
}

