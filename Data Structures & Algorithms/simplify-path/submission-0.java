class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String []k=path.split("/");
        StringBuilder j=new StringBuilder();
        for(String i:k){
            if(i.equals(".")||i.equals(""))continue;
            else if(i.equals("..")){
                if(!s.isEmpty())s.pop();
            }
            else s.push(i);  
        }
        for(String l:s){
            j.append('/').append(l);
        }
        return s.isEmpty()?"/":j.toString();
    }
}