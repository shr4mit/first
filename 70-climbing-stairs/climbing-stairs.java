class Solution {
    public int climbStairs(int n) {
    if(n<=2){
        return n;
    }
       int pp=1;
       int p=2;
       int ne=0;
       for(int i=2;i<n;i++){
         ne = pp+p;
        pp=p;
        p=ne;
       }
       return ne;
    }
}