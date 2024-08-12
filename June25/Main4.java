import java.util.Stack;


public class Main4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //add elements to stack using push()
        stack.push("Dog");
        stack.push("cat");
        stack.push("Horse");
        System.out.println(stack);


        //remove elements from stack using pop()
        String ele = stack.pop();
        System.out.println(ele);
        System.out.println(stack);

        //Peek() - return an object from top odf the Stack
        String str = stack.peek();
        System.out.println(str);

        // Search() returns position of elements from top odf the Stack
        int position = stack.search("dog");
        System.out.println(position);

        //empty() - to check if stack is empty
        boolean bool = stack.empty();
        System.out.println(bool);



        
    }
}