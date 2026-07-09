class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, count=0;
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            while(m.get(s.charAt(i))>1){
                if(m.get(s.charAt(left))==1){
                    m.remove(s.charAt(left));
                }
                else{
                    m.put(s.charAt(left),m.getOrDefault(s.charAt(left),0)-1);
                }
                left++;
            }
            count=Math.max(count,m.size());
        }
        return count;
    }
}
