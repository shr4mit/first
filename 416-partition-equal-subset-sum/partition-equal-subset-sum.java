class Solution {
    static Boolean dp[][];
    static boolean fxn(int arr[],int i,int total,int sum){
     if(i==arr.length) return false;
     if(sum==total/2) return true;
     if(dp[i][sum]!=null) return dp[i][sum];
     boolean ex=fxn(arr,i+1,total,sum);
     boolean in=fxn(arr,i+1,total,sum+arr[i]);
   return dp[i][sum]=ex||in;
    }
    public boolean canPartition(int[] nums) {
        int total=0;
    
       for(int x: nums){
         total+=x;
       } 
       dp=new Boolean[nums.length+1][total+1];
       
       if(total%2!=0) return false;
       return fxn(nums,0,total,0);
    }
}