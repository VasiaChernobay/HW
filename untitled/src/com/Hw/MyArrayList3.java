package com.Hw;
import jdk.internal.util.ArraysSupport;

import java.util.*;

public class MyArrayList3<E> {
    private final int DEFAULT_SIZE = 5;
    private Object[] myData = new Object[DEFAULT_SIZE];
    private int size = 0;
    private int modCount = 0;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};


    public int size() { // TODO: this
        return size;
    }


    public boolean isEmpty() {// TODO: this
        return size == 0;
    }


    public boolean contains(Object o) {// TODO: this
        return indexOf(o) >= 0;
    }


    public Object[] toArray() {
        return new Object[0];
    }


public boolean add(E e) {
    modCount++;
    add(e,myData,size);
    return true;
}
    private void add(E e, Object[] myData, int s) {
        if (s == myData.length)
            myData = grow();
        myData[s] = e;
        size = s + 1;
    }
public void add(int index, E element) {
    rangeCheckForAdd(index);
    modCount++;
    final int s;
    Object[] myData;
    if ((s = size) == (myData = this.myData).length)
       myData = grow();
    System.arraycopy(myData, index,
            myData, index + 1,
            s - index);
    myData[index] = element;
    size = s + 1;
}
    private Object[] grow(int minCapacity) {
        int oldCapacity = myData.length;
        if (oldCapacity > 0 || myData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return myData = Arrays.copyOf(myData, newCapacity);
        } else {
            return myData = new Object[Math.max(DEFAULT_SIZE, minCapacity)];
        }
    }

    private Object[] grow() {
       return grow(size + 1);
    }
    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    public boolean remove(Object o) {
        final Object[] es = myData;
        final int size = this.size;
        int i = 0;
        found:
        {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }

        }
        return false;
    }


    public void clear() {
        modCount++;
        final Object[] es = myData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }


    public E get(int index) {
        Objects.checkIndex(index, size);
        return (E) myData[index];
    }


    public E set(int index, E element) {
        Objects.checkIndex(index, size);
        E oldValue = (E) myData[index];
        myData[index] = element;
        return oldValue;
    }


    public int indexOf(Object o) {
        return indexOfRange(o, 0, size);
    }

    int indexOfRange(Object o, int start, int end) {
        Object[] es = myData;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }


        }


        return start;
    }

    public static void main(String[] args) {
        MyArrayList3<String> myArrayList3=new MyArrayList3<>();

        myArrayList3.add("ddd1");
        myArrayList3.add("ddd2");
        myArrayList3.add("ddd3");
        myArrayList3.add("ddd4");
        System.out.println(myArrayList3.get(0));
        System.out.println(myArrayList3.remove(1));
        System.out.println(myArrayList3.get(1));
      //  System.out.println(myArrayList3.remove(0));
        List<String> arr=new ArrayList<>();
        arr.add("ddd0");
        arr.add("ddd1");
        arr.add("ddd2");
        arr.add("ddd3");
        arr.add("ddd4");
        System.out.println(arr.get(0));
        System.out.println(arr.remove(1));
        System.out.println(arr.get(1));



    }
}