class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1, mid=low;
        if(target<nums[0])return 0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]<target)low=mid+1;
            else if(nums[mid]==target)return mid;
            else high=mid-1;
        }
        return target<nums[mid]?mid:mid+1;
    }
}