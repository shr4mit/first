class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int x,y=0;
        for(int i=0;i<n;i++){
           x=26-(s.charAt(i)-'a');
           y+=x*(i+1);
        }
        return y;
    }
}