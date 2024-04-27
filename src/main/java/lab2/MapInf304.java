package lab2;

import java.util.Collection;
import java.util.Set;

public interface MapInf304 <K, V>{
    V put(K key, V value);//если ключи совпадают, то возвращаем старое значение и перезаписываем на новое, если элемент новый, то return null

    V get(K key);

    V remove(K key);

    boolean containsKey (K key);

    Collection<V> values();

    Set<K> keySet();

}
