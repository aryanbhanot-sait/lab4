package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

    // Constructor
    public MyAList() {
        list = new ArrayList<>();
    }

    // Add single item
    public void add(E item) {
        list.add(item);
    }

    // Add all elements from another MyAList
    public void addAll(MyAList<E> items) {
        for (E item : items) {
            list.add(item);
        }
    }

    // Get item at index
    public E get(int index) {
        return list.get(index);
    }

    // Remove item at index
    public void remove(int index) {
        list.remove(index);
    }

    // Set item at index
    public void set(int index, E item) {
        list.set(index, item);
    }

    // List size
    public int size() {
        return list.size();
    }

    // Check if empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Convert to array
    public Object[] toArray() {
        return list.toArray();
    }

    // Remove all elements
    public void clear() {
        list.clear();
    }

	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
