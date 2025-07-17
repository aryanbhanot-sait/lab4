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
}
