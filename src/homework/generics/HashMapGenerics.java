package homework.generics;

import java.util.HashMap;
import java.util.Map;

public class HashMapGenerics<T,A> {
    Map<T, A> data = new HashMap<>();

    public Map<T, A> getData() {
        return data;
    }

    public void setData(Map<T, A> data) {
        this.data = data;
    }

}
