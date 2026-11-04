class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(0,nums,temp,ans);
        return ans;
    }
    public void solve(int idx,int[] nums,List<Integer> temp,List<List<Integer>> ans) {
        if(idx==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        solve(idx+1,nums,temp,ans);

        temp.remove(temp.size()-1);
        solve(idx+1,nums,temp,ans);
    }
}