class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n =nums.length;
        int left=0;
        int  window=0;
        int ans=n+1;
        for(int i=0;i<nums.length;i++){
            window+=nums[i];
            while(window>=target){
                ans=Math.min(ans,i-left+1);
                window-=nums[left++];
            }
        }
        return ans==n+1?0:ans;
    }
}