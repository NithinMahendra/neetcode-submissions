class Solution {
    public int subarraySum(int[] nums, int k) {
      int count=0,prefix=0;
      Map<Integer,Integer> m=new HashMap<>();
      m.put(0,1);
      for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        if(m.containsKey(prefix-k)){
            count+=m.get(prefix-k);
        }
        m.put(prefix,m.getOrDefault(prefix,0)+1);
      }
      return count;
    }
}