class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> l=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            l.add(entry);
            if(l.size()>k)l.poll();
        }
        for(int i=0;i<k;i++){
            res[i]=l.poll().getKey();
        }
        return res;
    }
}
