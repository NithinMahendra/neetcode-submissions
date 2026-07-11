class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0,left=0,right=people.length-1;
        Arrays.sort(people);
        while(left<=right){
            if(people[left]+people[right]>limit){
                count++;right--;
            }
            else{
                count++;
                left++;right--;
            }
        }
        return count;
    }
}