class Solution {
    public int mySqrt(int x) {
        int l=0,r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            long g=(long)mid*mid;
            if(g==x)return mid;
            else if(g<x)l=mid+1;
            else r=mid-1;
        }
        return r;
    }
}