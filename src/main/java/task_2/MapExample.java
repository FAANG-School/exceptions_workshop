package task_2;

import java.util.Map;

public class MapExample{
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if(value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}