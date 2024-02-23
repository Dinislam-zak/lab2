package ru.itis.inf304;

public class Set<T> implements SetInterface <T>{

    int capacity;

    Object [] array = new Object[0];
    public Set(int capacity){this.capacity = capacity;}
    @Override
    public void add(T element) throws EmptyElementException {
        if (element == null) throw new EmptyElementException();
        if (isContains(element)){
            System.out.println("Данный элемент уже присутствует в наборе");
        }
        else {
            Object[] arraynew = new Object[(array.length + 1) * 2];
            System.arraycopy(array, 0, arraynew, 0, array.length);
            arraynew [capacity++] = element;
            array = arraynew;
        }
    }

    @Override
    public StringBuilder asList() throws EmptyElementException {
        List304ImplAsLinkedList <T> list = new List304ImplAsLinkedList<>(0);
        for (int i = 0; i < capacity; i++){
            list.add((T) array[i]);
        }
        return list.listToString();
    }

    @Override
    public void delete(T element) {
        if (isContains(element)){
            for (int i = 0; i < capacity; i++){
                if (element.equals(array[i])){
                    for (int j = i; j < capacity; j++){
                        array[j] = array[j+1];
                    }
                    capacity--;
                    break;
                }
            }
        }
    }

    @Override
    public String contains(T element) {
        for (int i = 0; i < capacity; i++){
            if (element.equals(array[i])){
                return "этот элемент есть в наборе";
            }
        }
        return "этого элемента нет в наборе";
    }

    private boolean isContains(T element){
        for (int i = 0; i < capacity; i++){
            if (element.equals(array[i])){
                return true;
            }
        }
        return false;
    }

}
