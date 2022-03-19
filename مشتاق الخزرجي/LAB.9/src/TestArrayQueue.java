import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer>queue=new ArrayQueue<> (5);
        System.out.println ("input queue elements");
        Scanner in=new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            queue.enqueue (in.nextInt ());
            System.out.println ("first"+queue.first ());
            System.out.println ("size="+queue.size ());

        }
        System.out.println ("queue elements are");
        while (!queue.isEmpty ());
        System.out.println (queue.dequeue ());

    }

public class PrintFils{
    public static void main(String[] args)throws FileNotFoundException {
        ArrayQueue<String>filesToPrint=new ArrayQueue<> (3);
        System.out.println ("input file names to print");
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            filesToPrint.enqueue (in.next ());

        }
        System.out.println ("print files in queue");
        while (!filesToPrint.isEmpty ());
        {
            Scanner fileScan=new Scanner (new File (filesToPrint.dequeue ()));
            while (fileScan.hasNextLine ());
            System.out.println (fileScan.nextLine ());
        }

    }
}}
