class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int res=0;
        for(String i:operations){
            if(i.equals("+")){
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }
            else if(i.equals("D")){
                s.push(2*s.peek());
            }
            else if(i.equals("C")){
                s.pop();
            }
            else{
                int num=Integer.parseInt(i);
                s.push(num);
            }
        }
        for(int i:s){
            res+=i;
        }
        return res;
    }
}