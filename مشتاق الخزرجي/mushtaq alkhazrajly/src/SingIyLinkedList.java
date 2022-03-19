public class SingIyLinkedList <E>{
    Node<E>head=null;
    Node<E>tail=null;
    int size=0;
    public SingIyLinkedList(){

    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;

    }
    public E first(){
        if (isEmpty ())return null;
        return head.getElement ();
    }
    public void addFirst(E element)
    {
        head=new Node<E> (element,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addLast(E element)
    {Node<E>newest=new Node<E> (element,null);
        if (isEmpty ())
            head=newest;
        else
            tail.setNext (newest);
        size++;




    }
    public E removeFirst(){
        if (isEmpty ())
            return null;
        E deleted= head.getElement ();
        head=head.getNext ();
        size--;
        if (size==0)
            tail=null;
        return deleted;
    }
}
