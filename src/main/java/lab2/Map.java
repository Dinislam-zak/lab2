package lab2;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Map <K,V> implements MapInf304 <K,V>{
    LinkedList <Element<K, V>> Map = new LinkedList();
    @Override
    public V put(K key, V value) {
        if (containsKey(key)){
            Element e = new Element(key, value);
            for (int i = 0; i < Map.size(); i++){
                if (Map.get(i).key.equals(key)){
                    Map.set(i,e);
                    V oldValue = Map.get(i).value;
                    return oldValue;
                }
            }
        }
        Element e = new Element(key, value);
        Map.add(e);
        return value;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < Map.size(); i++){
            if (Map.get(i).key.equals(key)){
                return Map.get(i).value;
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        for (int i = 0; i < Map.size(); i++){
            if (Map.get(i).key.equals(key)){
                V oldValue = Map.get(i).value;
                Map.remove(i);
                return oldValue;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        for (int i = 0; i < Map.size(); i++){
            if (Map.get(i).key.equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection values() {
        Collection<V> result = new LinkedList<>();
        for (Element<K,V> i:Map){
            result.add(i.value);
        }
        return result;
    }

    @Override
    public Set keySet() {
        Set<K> result = new LinkedHashSet<>();
        for (Element<K,V> i:Map){
            result.add(i.key);
        }
        return result;
    }
}
