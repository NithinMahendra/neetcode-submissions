class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i!=']'){
                st.push(String.valueOf(i));
            }
            else{
                StringBuilder sb=new StringBuilder();
                while(!st.peek().equals("[")){
                    sb.insert(0,st.pop());
                }
                st.pop();
                StringBuilder k=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    k.insert(0,st.pop());
                }
                st.push(sb.toString().repeat(Integer.parseInt(k.toString())));
            }
        }
         StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()) {
            ans.insert(0, st.pop());
        }

        return ans.toString();
    }
}