import java.util.Queue;
import java.util.ArrayDeque;

//Alens Evra
/*This lab is split up into 2 parts, each of which will give you practice with queues, stacks, and 
algorithmic design: 
 
1.  MyQueue.java: Implement a queue using two stacks   
2.  MyStack.java: Implement a stack using two queues  
  */
public class MyStack<T> {
    // define two private instance variables
    private Queue<T> first;
    private Queue<T> second;

    // constructor
    public MyStack() {
        first = new ArrayDeque<T>();
        second = new ArrayDeque<T>();
    }

    // return the latest value of MyStack
    public T top() {
        // please implement this method
        if (first.isEmpty())
            return null;
        else
            return first.element();
    }

    // add value val to MyStack
    public void push(T val) {
        // please implement this method
        T temp;
        while (!first.isEmpty()) {
            temp = first.remove();
            second.add(temp);
        }

        first.add(val);
        while (!second.isEmpty()) {
            temp = second.remove();
            first.add(temp);
        }
    }

    // remove the oldest value from MyStack
    public void pop() {
        // please implement this method
        first.remove();
    }
}
