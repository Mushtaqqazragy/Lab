public class ArrayQueue <E>implements Queue<E>{
    final static int CAPACITY=100;
    E[]data;
    int sz=0;
    int f=0;

    public ArrayQueue(int c){
        data=(E[]) new Object [c];
    }
    public ArrayQueue(){
        this(CAPACITY);
    }


    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
    if (size ()==data.length)
        throw new IllegalStateException ("Queue is full");
    int index=(f+sz)%data.length;
    data[index]=element;
    sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty ())return null;
        E deleted=data[f];
        data[f]=null;
        f=(f+1)%data.length;
        sz--;
        return deleted;
    }

    @Override
    public E first() {
        if (isEmpty ())return null;
        return data[f];
    }
}
