class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> winmap=new HashMap<>();
        Map<Character,Integer> needmap=new HashMap<>();
        int start=0,minlength=Integer.MAX_VALUE,left=0,matched=0;
        for(char i:t.toCharArray()){
            needmap.put(i,needmap.getOrDefault(i,0)+1);
        }
        for(int right=0;right<s.length();right++){
            if(needmap.containsKey(s.charAt(right))){
                winmap.put(s.charAt(right),winmap.getOrDefault(s.charAt(right),0)+1);

                if(winmap.get(s.charAt(right)).equals(needmap.get(s.charAt(right)))){
                    matched++;
                }
            }
            while(matched==needmap.size()){
                if(minlength>right-left+1){
                    minlength=right-left+1;
                    start=left;
                }
                if(needmap.containsKey(s.charAt(left))){
                    winmap.put(s.charAt(left),winmap.getOrDefault(s.charAt(left),0)-1);
                    if(winmap.get(s.charAt(left))<needmap.get(s.charAt(left))){
                        matched--;
                    }
                }
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE?"":s.substring(start,start+minlength);
    }
}
