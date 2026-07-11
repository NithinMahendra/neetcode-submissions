class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int maxcount=Integer.MAX_VALUE,sum=0,left=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            //if(sum>=target)maxcount=Math.min(maxcount,i-left+1);
            while(sum>=target){
                maxcount=Math.min(maxcount,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return maxcount==Integer.MAX_VALUE?0:maxcount;
    }
}