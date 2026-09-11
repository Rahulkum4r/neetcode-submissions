class Solution {
    public int[] replaceElements(int[] arr) {

        //optimal force approach
        int n = arr.length;

       int max = arr[n-1];
       arr[n-1]=-1;

       for(int i =  n-2 ; i>=0 ; i--){
        int currMax = arr[i];
        arr[i]=max;
        max = Math.max(max , currMax);
       }
       return arr;
    }
}