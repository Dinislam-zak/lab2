package ru.itis.inf304;

public class List304ImplAsLinkedList <T> implements List304<T> {
    public int size;
    public int index = 1;
    public List304ImplAsLinkedList (int size) {this.size = size;}
    Element <T>head;
    Element <T>tail;

    @Override
    public void add(T e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        Element<T> current = new Element(e,index);
        index++;
        size++;
        if (tail == null) {
            head = current;
            tail = current;
        } else {
            tail.next = current;
            tail = current;
        }
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= size && index < 0) throw new IndexOutOfBoundsException();
        Element<T> current = head;
        T result = null;
        while (current!= null){
            if (current.index == index){
                result = current.value;
            }
            current = current.next;
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size && index < 0) throw new IndexOutOfBoundsException();
        Element<T> current = head;
        Element<T> prev = null;
        boolean flag = true;

        while (flag) {
            if (current.index == index - 1) {
                prev = current;
            }
            if (prev == null) {
                head = current.next;
                current.next = null;
                size--;
                flag = false;
                reindex();
            } else {

                if (current.index == index) {
                    prev.next = current.next;
                    current.next = null;
                    size--;
                    flag = false;
                    reindex();
                }
                current = head;
            }
            current = current.next;
        }
    }
    private void reindex(){
        Element<T> current = head;
        int i = 1;
        while (current != null){
            current.index = i;
            i++;
            current = current.next;
        }
    }
    @Override
    public T pop() {
        Element<T> current = head;
        boolean flag = true;
        T result = null;
        while (flag){
            if (current.next == null){
                result = current.value;
                delete(current.index);
                flag = false;
            }
            current = current.next;
        }
        return result;
    }
    public StringBuilder listToString() {
        StringBuilder string = new StringBuilder();
        Element<T> current = head;

        while (current != null) {
            string.append(current.value).append(" ");
            current = current.next;
        }
        return string;
    }
}