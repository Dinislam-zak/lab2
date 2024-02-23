package ru.itis.inf304;

public interface List304 <T> {
    void add(T e) throws EmptyElementException;

    T get(int index) throws IndexOutOfBoundsException;

    int size();

    void delete(int index) throws IndexOutOfBoundsException;
    // возвращаем последний элемент, и удаляем его из списка
    T pop();

}