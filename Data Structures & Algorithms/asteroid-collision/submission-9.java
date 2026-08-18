class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i:asteroids){
            boolean d=false;
            //if(s.isEmpty())s.push(i);
           
                while(!s.isEmpty() && s.peek()>0 && i<0){
                   // int max= Math.max(s.peek(),-i);
                    if(s.peek()>-i){
                        d=true;
                        break;
                    }
                    else if(s.peek()==-i){
                        d=true;
                        s.pop(); break;
                    }
                    else{
                        s.pop();
                    }
                }
                if(!d){s.push(i);}
        }
        return s.stream().mapToInt(Integer::intValue).toArray();
    }
}