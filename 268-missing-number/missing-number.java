class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int numssum=0;
        int actsum=n;
        for(int i=0;i<n;i++){
            numssum+=nums[i];
            actsum+=i;

        }
        return actsum-numssum;
        
}}