class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m= new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(String s:strs){
            char n[]=s.toCharArray();
            Arrays.sort(n);

            String key=new String(n);
            if(!m.containsKey(key)){
                m.put(key,new ArrayList<>());
            }
            m.get(key).add(s);
        }
        for(List<String> l:m.values()){
                res.add(l);
            }
        return res;
    }
}
