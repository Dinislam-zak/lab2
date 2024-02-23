package ru.itis.inf304;

public class Element <T>{
    public T value;
    public Element <T> next;

    public int index;
    public Element(T value, int index) {
        this.value = value;
        this.index = index;
    }
}