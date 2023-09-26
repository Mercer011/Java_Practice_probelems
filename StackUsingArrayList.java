import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {
    List<Integer> stackList;

    StackUsingArrayList() {
        stackList = new ArrayList<>();
    }
    void push(int value) {
        stackList.add(value);
    }
     int pop() {

         if (!isEmpty()) { 
              int popValue = stackList.get(stackList.size() - 1);
              stackList.remove(stackList.size() - 1);          
              return popValue;
         } else {
              System.out.print("The stack is already empty  ");
              return -1;
         }
    }
     boolean isEmpty() {
          if (stackList.isEmpty()){
               return true;
          } else {
                return false;
          }
     }
    int peek() {
         return stackList.get(stackList.size() - 1);
    }

    public static void main(String[] args) {
     StackUsingArrayList myStack = new StackUsingArrayList();
         myStack.push(5);
         myStack.push(8);
         myStack.push(2);
         myStack.push(9);

         System.out.println("*********************Stack ArrayList Implementation*********************");
         System.out.println(myStack.isEmpty());
         System.out.println(myStack.peek()); 
         System.out.println(myStack.pop()); 
         System.out.println(myStack.peek());
         System.out.println(myStack.pop());
    }
}