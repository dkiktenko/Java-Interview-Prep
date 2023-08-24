import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        // stack only declared
        Stack<Integer> stack;
        // stack, previously declared, initialized to an empty stack
        stack = new Stack<>();

        // print to console if stack is empty or not (same as isEmpty()) - O(1)
        System.out.println(stack.empty()); // true

        // adds item to the top of the stack - O(1)
        stack.push(1);

        // print to console the top-most item within the stack (doesn't remove) - O(1)
        System.out.println(stack.peek()); // 1
        // print to console if stack is empty or not (same as isEmpty()) - O(1)
        System.out.println(stack.empty()); // false

        // print to console the top-most item within the stack while removing it - O(1)
        System.out.println(stack.pop()); // 1
        // print to console if stack is empty or not (same as isEmpty()) - O(1)
        System.out.println(stack.empty()); // true

        // print to console index of first instance (from last index) of the specified item - O(n)
        System.out.println(stack.search(1)); // -1
    }
}
