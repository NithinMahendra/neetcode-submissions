class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int num:s){
            int len=1;
            int cur=num;
            if(!s.contains(cur-1)){
                while(cur != Integer.MAX_VALUE && s.contains(cur + 1)){
                len++;
                cur++;
            }
            }
            maxlen=maxlen>len?maxlen:len;
        }
        return maxlen;
    }
}
