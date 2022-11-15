public class StackTest {
    public static void main (String[] args)
    {
      MyStack<String> names = new MyStack<String>(); /* Declare a MyQueue */
      names.push ("Liz"); /* add values to the end of the MyQueue */
      names.push ("John");
      names.push ("Mike"); 

      System.out.println("Serve the people in queue: ");
      System.out.println(names.top());
      names.pop();
      System.out.println(names.top());
      names.pop();
      System.out.println(names.top());
      names.pop();
    }
}
