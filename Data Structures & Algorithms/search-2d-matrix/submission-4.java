class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int x=matrix.length,y=matrix[0].length;
            int low=0,high=x*y-1;
            System.out.print(high);
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix[mid/y][mid%y]==target)return true;
                else if(matrix[mid/y][mid%y]<target)low=mid+1;
                else high=mid-1;
            }
        return false;
    }
}
