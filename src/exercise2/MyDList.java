package exercise2;

public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;

	public MyDList() {
        head = null;
        tail = null;
        size = 0;
    }

    public MyNode<E> getHead() {
        return head;
    }

    public void addFirst(E item) {
        MyNode<E> newNode = new MyNode<>(item);
        newNode.setNext(head);
        if (head != null) head.setPrev(newNode);
        head = newNode;
        if (tail == null) tail = newNode;
        size++;
    }

	public void addLast(E item) {
        MyNode<E> newNode = new MyNode<>(item);
        newNode.setPrev(tail);
        if (tail != null) tail.setNext(newNode);
        tail = newNode;
        if (head == null) head = newNode;
        size++;
    }

    public E removeFirst() {
        if (head == null) return null;
        E elem = head.getElement();
        head = head.getNext();
        if (head != null) head.setPrev(null);
        else tail = null;
        size--;
        return elem;
    }

    public E removeLast() {
        if (tail == null) return null;
        E elem = tail.getElement();
        tail = tail.getPrev();
        if (tail != null) tail.setNext(null);
        else head = null;
        size--;
        return elem;
    }

	public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
