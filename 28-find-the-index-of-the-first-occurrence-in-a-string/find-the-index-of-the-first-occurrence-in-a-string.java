class Solution {
    public int strStr(String hay,String ned) {
        int h=hay.length();
        int n=ned.length();
        for(int i=0;i<=h-n;i++){
            int t=0;
            for(int j=0;j<n;j++){
                if(hay.charAt(i+j)==ned.charAt(j)){
                    t++;
                }else{
                    break;
                }
            }
            if(t==n){
                return i;
            }
        }
        return -1;
    }
}