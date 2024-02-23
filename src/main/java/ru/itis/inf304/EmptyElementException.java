package ru.itis.inf304;

public class EmptyElementException extends Exception{
    public EmptyElementException(){
        super("Element should be not null");
    }
}