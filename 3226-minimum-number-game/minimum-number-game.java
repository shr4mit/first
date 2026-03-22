class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                continue;
            }else{
          int temp=nums[i];
             nums[i]=nums[i+1];
             nums[i+1]=temp;
            }
        }
        return nums;
    }
}