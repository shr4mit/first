class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int max=nums[0];
        int i=0,j=nums.length-1;

        while(i<nums.length){

           if(prefix==0) prefix=1;
          
           if(suffix==0) suffix=1;
        
          prefix *=nums[i];
          suffix *=nums[j];
             
            if(prefix>max){
                max=prefix;
            } if(suffix>max)
            max=suffix;       
            i++; j--;
        }
        return max;
    }
}