import java.util.Stack;

public class MinStackLeetcode155 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStackLeetcode155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    public static void main(String[] args) {
        MinStackLeetcode155 l = new MinStackLeetcode155();
        l.push(-2);
        l.push(0);
        l.push(-3);
        System.out.println( l);

        System.out.println( l.getMin());

        l.pop();
        System.out.println(l);

        System.out.println( l.top());
        System.out.println(l.getMin());
    }
}
