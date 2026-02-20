class Solution {

    public int search(int[] nums, int target) {
     return BSearch(nums,0,nums.length-1,target);
    }
    public int BSearch(int nums[],int low, int high,int target) {
        if (low>high)
            return -1;
        int mid=(low+high)/2;
        if(target==nums[mid]){
            return mid;
        }else if(target>nums[mid]){
            return BSearch(nums,mid+1,high,target);
        }else{
            return BSearch(nums,low,mid-1,target);
        }
    }
}