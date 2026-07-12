class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length())return false;
        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> win=new HashMap<>();
        int matched=0,left=0,k=s1.length();
        for(int i=0;i<s1.length();i++){
            need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            if(need.containsKey(s2.charAt(i))){
                win.put(s2.charAt(i),win.getOrDefault(s2.charAt(i),0)+1);
                if(need.get(s2.charAt(i)).equals(win.get(s2.charAt(i)))){
                    matched++;
                }
            }
             while(i-left+1>k){
                if(need.containsKey(s2.charAt(left))){
                   
                    if(need.get(s2.charAt(left)).equals(win.get(s2.charAt(left)))){
                        matched--;
                    }
                     win.put(s2.charAt(left),win.getOrDefault(s2.charAt(left),0)-1);
                }
                left++;
            }
            if(matched==need.size())return true;
        }
        
        return false;
    }
}
