package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

    public MyAList() {
        list = new ArrayList<>();
    }

    public void add(E item) {
        list.add(item);
    }

    public void addAll(MyAList<E> items) {
        for (E item : items) {
            list.add(item);
        }
    }


	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
