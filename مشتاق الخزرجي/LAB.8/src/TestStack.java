import java.util.Scanner;

public class TestStack{
    public static void main(String[] args) {
        ArrayStack<Integer> mySack=new ArrayStack<> (5);
        Scanner in=new Scanner (System.in);
        System.out.println ("is the stack empty?"+mySack.isEmpty ());
        System.out.println ("inpment elements");
        for (int i = 0; i < 6; i++) {
            mySack.push (in.nextInt ());
            System.out.println ("top element ="+mySack.top ());
            System.out.println ("size ="+mySack.size ());
            System.out.println ("is the stack empty?"+mySack.isEmpty ());
        }
    }

public class test{
    public static void main(String[] args) {
        ArrayStack<Integer>myStack=new ArrayStack<> (5);
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {

            myStack.push (in.nextInt ());
            System.out.println ("top="+myStack.top ());
            System.out.println ("size of stack="+myStack.size ());


        }
        System.out.println ("after calling pop");
        for (int i = 0; i < 6; i++) {

            myStack.pop ();
            System.out.println ("top"+myStack.top ());
            System.out.println ("size of stack="+myStack.size ());

        }
    }
}

}