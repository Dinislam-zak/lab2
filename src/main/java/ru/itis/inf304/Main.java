package ru.itis.inf304;

import java.util.Iterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        /*List304ImplAsLinkedList<String> list1 = new List304ImplAsLinkedList<>(0);
        try {
            list1.add("Первый");
            list1.add("Второй");
            list1.add("Третий");
            list1.add("Четвертый");
            list1.add("Пятый");
            System.out.println(list1.listToString());
            System.out.println(list1.get(2));
            System.out.println(list1.size);
            list1.delete(1);
            list1.delete(2);
            System.out.println(list1.listToString());
            System.out.println(list1.size);
            list1.pop();
            System.out.println(list1.listToString());
            System.out.println(list1.size);
        } catch (EmptyElementException | IndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }*/
        List304ImplAsArray<Integer> array1 = new List304ImplAsArray<>(0);

            array1.add(1);
            array1.add(2);
            array1.add(3);
            array1.add(4);
            array1.add(5);
        array1.iterator().forEachRemaining(array1);
            Iterator <Integer> iterator = array1.iterator();

        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();
        iterator.remove();
        System.out.println(iterator.next());*/

           /* System.out.println(array1.size());
            array1.delete(2);
            System.out.println(array1.pop());*/


        /*Stack <Integer> stack1 = new Stack<>(0);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        System.out.println("size:" + stack1.size());
        System.out.println(stack1.stackToString());
        stack1.pop();
        System.out.println(stack1.stackToString());*/

//        Set <Integer> set1 = new Set<>(0);
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        set1.add(5);
//        set1.add(5);
//        set1.delete(4);
//        set1.delete(124);
//        System.out.println(set1.contains(1));
//        System.out.println(set1.asList());
    }

    class Printer <T> implements Consumer<T>{

        @Override
        public void accept(T t) {
            System.out.println(t);
        }
    }
}