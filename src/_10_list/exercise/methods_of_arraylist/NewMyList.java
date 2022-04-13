package _10_list.exercise.methods_of_arraylist;

import java.util.Arrays;

public class NewMyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public NewMyList(int capacity) {
        elements = new Object[capacity];
    }

    public NewMyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }


    public int size() {
        return this.size;
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
        }
        elements[size - 1 ]  = null;
        size--;
        return (E) elements;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if(o == elements[i]){
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }
    public boolean contains (E o){
        if(indexOf(o) != -1 ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            if(elements[i] == null)
                break;
            result.append(elements[i]);
            if (i < size - 1)
                result.append(", ");
        }

        return result.toString() + "]";
    }
}

