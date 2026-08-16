class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> s=new Stack<>();
        for(String k:tokens){
            if(k.equals("+")){
                int i=s.pop();
                int j=s.pop();
                s.push(i+j);
            }
            else if(k.equals("-")){
                int i=s.pop();
                int j=s.pop();
                s.push(j-i);
            }
            else if(k.equals("/")){
                int i=s.pop();
                int j=s.pop();
                if(i!=0)s.push(j/i);
            }
            else if(k.equals("*")){
                int i=s.pop();
                int j=s.pop();
                s.push(i*j);
            }
            else{
                s.push(Integer.parseInt(k));
            }
        }
        //System.out.print(s.peek());
        return s.isEmpty()?0:s.peek();
    }
}
