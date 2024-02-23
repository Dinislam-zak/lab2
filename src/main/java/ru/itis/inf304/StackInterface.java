package ru.itis.inf304;

public interface StackInterface <T> {
    void pop();

    void push(T e) throws EmptyElementException;

    int size();
}
