class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack =new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else
          stack.push(s.charAt(i));
        }
        String st="";
        while(!stack.isEmpty()){
            st=stack.pop()+st;
        }
        
        return st;
    }
}