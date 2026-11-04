class Solution {
    static int dp[][];
    static int fxn(int arr[], int i, int j ){
        if(i+1==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){

        int cost=fxn(arr,i,k)+fxn(arr,k,j)+arr[j]-arr[i];
        ans=Math.min(ans,cost);
        }
        return dp[i][j]= ans;
    }
    public int minCost(int n, int[] cuts) {
        dp=new int[cuts.length+3][cuts.length+3];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int arr[]=new int[cuts.length+2];
        arr[0]=0;
        arr[cuts.length+1]=n;
        for(int i=0;i<cuts.length;i++){
            arr[i+1]=cuts[i];
        }
        Arrays.sort(arr);

        return fxn(arr,0,cuts.length+1);
    }
}