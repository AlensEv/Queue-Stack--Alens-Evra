import java.util.Stack;
public class MyQueue<T> {
    // define two private instance variables
    private Stack<T> first;
    private Stack<T> second;
     
    // constructor 
    public MyQueue() {
        first = new Stack<T>();
        second = new Stack<T>();
    }

    // return the value of the oldest member
    public T front(){
        // please implement this method
        return first.peek();
    }

    // add value val to MyQueue
    public void push(T val){
        // please implement this method
        T temp;
        while(!first.empty()){
            temp = first.pop();
            second.push(temp);
        }
        
        first.push(val);
        while(!second.empty()){
            temp = second.pop();
            first.push(temp);
        }
    }

    // remove the oldest member from MyQueue
    public void pop(){
        // please implement this method
        first.pop();
    }
}
