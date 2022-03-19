public class LinKedStack <E>implements Stack<E>{
    SingIyLinkedList<E>list=new SingIyLinkedList<E> ();
    @Override
    public boolean isEmpty() {
        return list.isEmpty ();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first ();
    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }
}
