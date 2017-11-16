package TableNested;

import Table.Entry;
import Table.Table;
import com.sun.tools.javac.util.Name;

import java.util.ArrayList;
import java.util.Stack;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> extends Table{

    class Entry<E, P>{

    }

}
