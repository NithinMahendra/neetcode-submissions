class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxlen=0,win=0;
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            for(int val:m.values()){
                maxlen=Math.max(val,maxlen);
            }
            while((i-left+1)-maxlen>k){
                maxlen=0;
                for(int val:m.values()){
                    maxlen=Math.max(val,maxlen);
                }
                m.put(s.charAt(left),m.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            win = Math.max(win,i-left+1);
        }
        return win;
    }
}
