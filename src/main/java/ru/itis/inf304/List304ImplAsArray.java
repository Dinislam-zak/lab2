package ru.itis.inf304;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class List304ImplAsArray<T>implements List304<T>, Iterable<T>, Consumer<T>{
    int capacity;
    public List304ImplAsArray(int capacity){
        this.capacity = capacity;
    }
    Object array [] = new Object[0];
    @Override
    public void add(T e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        Object arraynew [] = new Object[array.length +1 * 2];
        System.arraycopy(array, 0, arraynew, 0, array.length);
        arraynew [capacity++] = e;
        array = arraynew;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= capacity && index < 0) throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= capacity && index < 0) throw new IndexOutOfBoundsException();
        for (int i = index - 1; i < capacity-1; i++){
            array[i] = array[i+1];
        }
        capacity--;
    }

    @Override
    public T pop() {
        Object result = array[capacity];
        capacity--;
        return (T) result;
    }
    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++ ){
            string += " " + array[i];
        }
        System.out.println(string);
        return string;
    }



    @Override
    public Iterator<T> iterator() {
        return new listIterator<>();
    }

    @Override
    public void accept(T t) {
        System.out.println("+ - + -");
    }

    private class listIterator<T> implements Iterator<T>{
        private int i;
        private boolean flag = false;

        public listIterator(){
            i = 0;
        }
        @Override
        public boolean hasNext() {
            return i < capacity;
        }

        @Override
        public void remove() {
            if (flag) throw new RuntimeException();
            delete(i-1);
            flag = true;
        }

        @Override
        public T next() {
            if (array[i] == null) throw new NoSuchElementException();
            return (T)array[i++];
        }
        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}
