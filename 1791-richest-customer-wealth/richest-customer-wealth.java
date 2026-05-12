class Solution {
    public int maximumWealth(int[][] accounts) {
      
        int ans=0;
        for(int i=0;i<accounts.length;i++){
              int high=0;
            for(int j=0;j<accounts[i].length;j++){
                high=high+accounts[i][j];

                }
                if(high>ans){
                    ans=high;
                }
            }
              return ans;
        }
      
    }
