class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int len=Math.min(word1.length(),word2.length());
        for(int i=0;i<len;i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if(len<word1.length())s.append(word1.substring(len,word1.length()));
        else s.append(word2.substring(len,word2.length()));
        return s.toString();
    }
}