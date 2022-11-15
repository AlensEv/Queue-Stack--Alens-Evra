

public class QueueTest {
    public static void main (String[] args)
    {
      MyQueue<String> names = new MyQueue<String>(); /* Declare a MyQueue */
      names.push ("Liz"); /* add values to the end of the MyQueue */
      names.push ("nina");
      names.push ("Mike"); 

      System.out.println("Serve the people in queue: ");
      System.out.println(names.front());
      names.pop();
      System.out.println(names.front());
      names.pop();
      System.out.println(names.front());
      names.pop();
    }
}
