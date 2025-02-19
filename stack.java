
import java.util.Stack;

public class stack {
    //what is stack
    //astack is a LIFO data structure
    //push
    //pop
    //peek
    //isEmpty
    public static void main(String[] args) {
        Stack<Object> s=new Stack<>();
        s.push(1);
        s.push(23456);
        s.push("suhavi");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.isEmpty());

    }
}
