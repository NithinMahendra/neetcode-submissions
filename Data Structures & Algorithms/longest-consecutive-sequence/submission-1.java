class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int len=1;
            while(s.contains(nums[i]-1)){
                len++;
                nums[i]=nums[i]-1;
            }
            maxlen=maxlen>len?maxlen:len;
        }
        return maxlen;
    }
}
