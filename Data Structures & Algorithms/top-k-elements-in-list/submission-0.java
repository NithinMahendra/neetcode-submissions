class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            res[i]=l.get(i).getKey();
        }
        return res;
    }
}
