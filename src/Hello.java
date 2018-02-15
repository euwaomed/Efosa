public class Hello
{
    public static void hello(String message, int count)
    {
       for(int counter=0; counter<count; counter++) // your code here

           // Purpose of for loop was to achieve two things:
                // 1) Make script readable
                // 2)Increments the counter automatically

           //Counter=0 is the initialization expression for the loop.
           //Counter<count is the termination expression for the loop. Once it is false, the loop ends.
           //counter++ is the increment expression that is invoked after each iteration through the loop.
                //I chose an increment of +1

           //Info is from The Java™ Tutorials

           System.out.println(message);
            // Prints the message, "hello world", until the for-loop condition is satisfied.
    }

    public static void main(String[] args)
    {
        hello("hello world", 4);
    }
}
