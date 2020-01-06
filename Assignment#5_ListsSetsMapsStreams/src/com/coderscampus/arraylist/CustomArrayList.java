package com.coderscampus.arraylist;


public class CustomArrayList<T> implements CustomList<T> {
	
	Integer x = 10;
	Object[] items = new Object[x];

	@Override
	public boolean add(T item) {
		int elements = getSize();
		if (items.length > elements) {
			items[elements] = item;
			return true;
			
		} else if (items.length == elements) {
			x = x * 2;
			Object[] newItems = new Object[x];
			for (int i = 0; i < elements; i++) {
				newItems[i] = items[i];
				System.out.println(" copied name is " + newItems[i]);
			}
			items = newItems;
			items[elements] = item;
			return true;
			
		}
		return false;
	}

	@Override
	public int getSize() {
		int countOfElements = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				countOfElements ++;
			}
		}
		
		return countOfElements;
	}

	@Override
	public T get(int index) {
		T getObject = (T) items[index];
		return getObject;
	}
	
}
