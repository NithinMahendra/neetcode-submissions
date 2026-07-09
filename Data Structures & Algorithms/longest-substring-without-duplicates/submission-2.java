class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0,left=0;
        Set<Character> st=new HashSet<>();

        for(int i=0;i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
