class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!d.isEmpty() && d.peekLast()<nums[i]){
                d.removeLast();
            }
            d.addLast(nums[i]);
        }
        res.add(d.peekFirst());
        for(int i=k;i<nums.length;i++){
            while(!d.isEmpty() && d.peekLast()<nums[i]){
                d.removeLast();
            }
            d.addLast(nums[i]);
            if(d.peekFirst()==nums[i-k])d.removeFirst();
            res.add(d.peekFirst());
        }
        return res.stream().mapToInt(x->x.intValue()).toArray();
    }
}
