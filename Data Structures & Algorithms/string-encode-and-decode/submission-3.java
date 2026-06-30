class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
                sb.append(strs.get(i).length());
                sb.append('#');
                sb.append(strs.get(i));
           
        }
        System.out.print(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int num=0;
            while(str.charAt(i)!='#'){
                num=num*10+(str.charAt(i)-'0');i++;
            }
            res.add(str.substring(i+1,i+num+1));i=i+num;
        }
        return res;
    }
}
