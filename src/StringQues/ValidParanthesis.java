package StringQues;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < stack.size() ; i++){
            if( (stack.get(i) == '(') ){
                stack.push(')');
            }else if((stack.get(i) == '{') ){
                stack.push('}');
            }else if((stack.get(i) == '[') ){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != stack.get(i)){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
