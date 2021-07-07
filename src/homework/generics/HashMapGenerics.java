package homework.generics;

import java.util.HashMap;
import java.util.Map;

public class HashMapGenerics<K,V> {
    Map<K,V> data = new HashMap<>();

    public Map<K,V> getData() {
        return data;
    }

    public void setData(Map<K,V> data) {
        this.data = data;
    }

}
