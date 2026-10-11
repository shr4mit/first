class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str="";
        String s=strs[0];
        String t=strs[strs.length-1];
        for(int i=0;i<s.length();i++){
                  if(s.charAt(i)==t.charAt(i)){
                    str+=s.charAt(i);
                  }else{
                    return str;
                  }

            }
        return str;
    }
}