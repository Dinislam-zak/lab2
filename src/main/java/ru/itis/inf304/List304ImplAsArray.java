package ru.itis.inf304;

public class List304ImplAsArray<T>implements List304<T>{
    int capacity;
    public List304ImplAsArray(int capacity){
        this.capacity = capacity;
    }
    Object array [] = new Object[0];
    @Override
    public void add(T e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        Object arraynew [] = new Object[array.length * 2];
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
}
