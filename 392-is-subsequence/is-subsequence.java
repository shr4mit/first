class Solution {
    static boolean check(String s, String t, int i, int j) {
        if(i==s.length()) return true;
        if(j==t.length()) return false;
        if(s.charAt(i)==t.charAt(j))
         return check(s, t, i + 1, j + 1);
        else
         return check(s, t, i, j + 1);
    }
    public boolean isSubsequence(String s, String t) {
       return check(s, t, 0, 0);
    }
}