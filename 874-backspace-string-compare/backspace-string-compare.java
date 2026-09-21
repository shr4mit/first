import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String a="";
        while(!stack.isEmpty()){
           a=stack.pop()+a;
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(t.charAt(i));
            }
        }
        String b="";
        while(!stack.isEmpty()){
            b=stack.pop()+b;
        }
        return a.equals(b);
    }
}