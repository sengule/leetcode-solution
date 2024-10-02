package Stack.easy;

import java.util.Stack;

public class stack_1544 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                char peek = stack.peek();
                if((peek-32 == c) || (peek+32 == c)){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char c = stack.pop();
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
