class Solution {
    static int fxn(int arr[], int i,int sum,int target){
        if(i==arr.length){
          if(sum==target) return 1;
        return 0;
        }
        int ex=fxn(arr,i+1,sum-arr[i],target);
        int in=fxn(arr,i+1,sum+arr[i],target);
        return ex+in;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return fxn(nums,0,0,target);
    }
}