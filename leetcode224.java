import java.util.Stack;

public class leetcode224 {
    public static void main(String[] args) {
        String s = "2+2";
        System.out.println(calculate(s));
    }
     public static  int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0, sign = 1, result = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+' || c == '-') {
                result += sign * number;
                number = 0;
                sign = (c == '+') ? 1 : -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result = stack.pop() * result + stack.pop();
            }
        }

        return result + sign * number;
    }
}
