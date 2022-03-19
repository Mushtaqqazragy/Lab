import java.util.LinkedList;
import java.util.Scanner;

public class TestDoubleLinkedList {
    LinkedList<String>1= new LinkedList <E> ();
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<> ();
        Scanner in = new Scanner (System.in);
        int choice = -1;
        System.out.println ("1 add first");
        System.out.println ("2 add last");
        System.out.println ("3 remove first");
        System.out.println ("4 remove last");
        System.out.println ("0 exit");
        while (choice != 0) {
            System.out.println ("your choice:");
            choice = in.nextInt ();
            switch (choice) {
                case 1:
                    System.out.println ("input name");
                    list.addFirst (in.next ());
                    break;

                case 2:
                    System.out.println ("input ur name");
                    list.addLast (in.next ());
                    break;
                case 3:
                    System.out.println ("deleted is " + list.removeFirst ());
                    break;
                case 4:
                    System.out.println ("deleted is " + list.removeLast ());
                    break;
                case 0:
                    System.exit (0);
                    break;
            }
            System.out.println ("fist= "+list.first ()+"\t last="+list.last ()+"\tsize="+list.size ());
        }


    }

    private class E {
    }
}

