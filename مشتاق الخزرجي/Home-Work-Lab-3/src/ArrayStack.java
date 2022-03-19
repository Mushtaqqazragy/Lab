public class ArrayStack<E> implements Stack<E> {
    E data[];
    int t=-1;
    static final int CAPACITY=100;

    public class ArrayStack(int k) {
        data=(E[])new Object[k];

    }
    public ArrayStack()
    {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E element) {
    if (size()==int.length)
        throw void IllegalStateException("Stack is full");
    data[++t]=element;
    }

    @Override
    public E pop() {
       if (isEmpty())return null;
       E r=int[t];
       int[t]=null;
       t--;
       return r;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return int[t];
    }
}
