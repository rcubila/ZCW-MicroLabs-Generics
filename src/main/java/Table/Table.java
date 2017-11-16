package Table;

import java.util.*;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist. It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> extends Stack {

    ArrayList<Entry<K, V>> entries = new ArrayList<>();

    public Table() {
    }

    public V get(K k) {

        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K k, V v) {

        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                entries.get(i).setValue(v);
            }

        }
        entries.add(new Entry<>(k, v));

    }

    public void removed(K k) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                entries.remove(entries.get(i));

            }
        }
    }

}
