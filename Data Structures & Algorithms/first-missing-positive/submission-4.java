class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int j=1;j<=nums.length;j++){
            if(!m.containsKey(j)){
                return j;
            }
        }
        return nums.length+1;
    }
}