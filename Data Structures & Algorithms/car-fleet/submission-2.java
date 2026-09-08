class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Pair[] pairs=new Pair[position.length];
        Stack<Double> s=new Stack<>();
        for(int i=0;i<pairs.length;i++){
            pairs[i]=new Pair(position[i],speed[i]);
        }
        Arrays.sort(pairs,(a,b)->b.position-a.position);
        for(Pair p:pairs){
            double time=(double)(target-p.position)/p.speed;
            if(s.isEmpty() || s.peek()<time){
                s.push(time);
            }
            
        }
        return s.size();
    }
}
class Pair{
    int position;
    int speed;
    public Pair(int pos,int sp){
        position=pos;
        speed=sp;
    }
}
