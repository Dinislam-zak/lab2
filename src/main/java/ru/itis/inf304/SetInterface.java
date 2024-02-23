package ru.itis.inf304;

public interface SetInterface <T>{
    void add(T element) throws EmptyElementException;

    StringBuilder asList() throws EmptyElementException;

    void delete(T element) throws EmptyElementException;

    String contains(T element);

}
