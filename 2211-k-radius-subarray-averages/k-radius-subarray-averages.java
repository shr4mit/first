class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]=new int [nums.length];
        Arrays.fill(arr,-1);
        long win=0;
        int idx=2*k+1;
        int kk=k;
        if(idx>arr.length){
            return arr;
        }
        for(int i=0;i<idx;i++){
            win+=nums[i];
        }
      
        arr[kk]=(int)(win/idx);
        for(int i=idx;i<arr.length;i++){
            win=win-nums[i-idx]+nums[i];
            arr[++k]=(int)(win/idx);
                    }
                    return arr;
    }
}