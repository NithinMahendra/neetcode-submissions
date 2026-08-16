class Solution {
    public int evalRPN(String[] tokens) {
       Stack<String> s=new Stack<>();
        for(String k:tokens){
            if(k.equals("+")){
                int i=Integer.parseInt(s.pop());
                int j=Integer.parseInt(s.pop());
                s.push(Integer.toString(i+j));
            }
            else if(k.equals("-")){
                int i=Integer.parseInt(s.pop());
                int j=Integer.parseInt(s.pop());
                s.push(Integer.toString(j-i));
            }
            else if(k.equals("/")){
                int i=Integer.parseInt(s.pop());
                int j=Integer.parseInt(s.pop());
                if(i!=0)s.push(Integer.toString(j/i));
            }
            else if(k.equals("*")){
                int i=Integer.parseInt(s.pop());
                int j=Integer.parseInt(s.pop());
                s.push(Integer.toString(i*j));
            }
            else{
                s.push(k);
            }
        }
        //System.out.print(s.peek());
        return s.isEmpty()?0:Integer.parseInt(s.peek());
    }
}
