class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;

        int []ans = new int[n];
        int postiveIndex = 0;
        int negativeIndex = 1;

        for(int i =0 ;  i<n ; i++){

            if(nums[i]>0){
                ans[postiveIndex] = nums[i];
                postiveIndex += 2;
            }
            else{
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return ans ;
    }
}