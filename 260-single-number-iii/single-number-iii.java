class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int x:nums){
            xor ^=x;
        }
        int x=xor & -xor;
        int first=0;
        int sec=0;
        for(int num:nums){
            if((num &x)!=0){
                first ^=num;
            }else{
                sec ^=num;
            }
        }
        return new int[]{first,sec};
            }
}