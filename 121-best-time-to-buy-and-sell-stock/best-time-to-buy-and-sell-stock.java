class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int pr=0;
        int mxpr=0;
        for(int i=1;i<prices.length;i++){
             if(min>prices[i]){
                min=prices[i];
             }
             pr=prices[i]-min;
             if(pr>mxpr){
                mxpr=pr;
             }
        }
        return mxpr;
    }
}