package liangintro.mapset;

import java.util.Set;

public interface MyMap<K, V> {
    public void clear();
    public void containsKey(K key);
    public void containsValue(V value);
    public Set<Entry<K, V>> entrySet();
    public V get(K key);
    public V put(K key, V value);
    public void remove(K key);
    public boolean isEmpty();
    public Set<K> keySet();
    public Set<V> values();
    public int size();


    public static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "EntrySet{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    };
}
