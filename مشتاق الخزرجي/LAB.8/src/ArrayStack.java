public class ArrayStack <E>implements  Stack<E>{
    public static final int CAPACITY=100;
    E []data;
    int t=-1;
    public ArrayStack() {
        this(CAPACITY);
    }
    public ArrayStack(int capacity){
        data=(E[]) new Object [capacity];
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
        if (size ()==data.length)
            throw new IllegalStateException ("stack is full");
        data[++t]=element;

    }

    @Override
    public E pop() {
        if (isEmpty ())return null;
        E deleted=data[t];
        data[t]=null;
        t--;
        return deleted;
    }

    @Override
    public E top() {
        if (!isEmpty ())
            return data[t];

        return null;
    }
}
