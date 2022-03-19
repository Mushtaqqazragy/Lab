public class Test {
    public static void main(String[] args) {
        SingIyLinkedList<String>list=new SingIyLinkedList<> ();
        System.out.println (list.size);
        list.addFirst ("Fatima");
        list.addLast ("alazazi");
        System.out.println (list.size);
        while (!list.isEmpty ())
            System.out.println (list.removeFirst ());
    }
}
