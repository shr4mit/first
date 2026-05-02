class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        salary[0]=0;
        double res=0;
        double z=0;
        salary[salary.length-1]=0;
        for(int i=0;i<salary.length;i++){
            res+=salary[i];
            if(salary[i]!=0){
            z++;
            }
        }
        return res/z;
    }
}