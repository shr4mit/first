class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int res=0;
    int sum=0;

    for(int i =0;i<nums.length;i++){
        if(nums[i]==1){
            res++;
            if(sum<res){
            sum=res;
            }
        }else{
            res=0;
        }
    }
    return sum;
    }
}