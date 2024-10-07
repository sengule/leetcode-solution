package Stack.medium;

import java.util.Stack;

public class stack_227 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();
        char operator = '+';
        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }

            if(!Character.isDigit(c)  && c != ' ' || i == s.length() - 1){
                if(operator == '+'){
                    stack.push(num);
                }

                if(operator == '-'){
                    stack.push(-num);
                }

                if(operator == '/'){
                    stack.push(stack.pop() / num);
                }

                if(operator == '*'){
                    stack.push(stack.pop() * num);
                }

                operator = c;
                num = 0;
            }
        }

        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}
