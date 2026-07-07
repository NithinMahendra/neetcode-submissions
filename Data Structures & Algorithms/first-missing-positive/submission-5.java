class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                int t=nums[i];
                int index=nums[i]-1;
                nums[i]=nums[nums[i]-1];
                nums[index]=t;
            }
        }
        System.out.print(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i])return i+1;
        }
        return nums.length+1;
    }
}