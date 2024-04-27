package ru.itis.inf304;

public class Stack <T> implements StackInterface<T>{
    int size;
    public Stack(int size){this.size = size;}

    T head;

    Object[] array = new Object[0];
    @Override
    public void pop() {
        head = (T) array[size - 1];
        array[size] = null;
        size--;
    }

//    public T pop1(){
//        T headOld = head;
//        head = (T) array[size - 1];
//        array[size] = null;
//        size--;
//        return headOld;
//    }
    @Override
    public void push(T element) {
        Object[] arrayNew = new Object[(array.length +1) *2];
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        arrayNew [size++] = element;
        array = arrayNew;
        head = element;
    }

    @Override
    public int size() {
        return size;
    }

    public StringBuilder stackToString() {
        StringBuilder string = new StringBuilder();
        for (int i = size-1; i >= 0; i--){
            string.append(array[i]).append('\n');
        }
        return string;
    }
}
