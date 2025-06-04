import Controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("");
        System.out.println("Tam ="+ stack.size());   
        stack.printStack();
        stack.pop();
        System.out.println("");
        System.out.println("Tam ="+ stack.size());
        stack.printStack();
    }
}
