package MapFunc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc <E, R>{

    public static <R,E> ArrayList<R> map(ArrayList<E> list, Function<E, R> function){

        ArrayList<R> results = list.stream().map(function::apply).collect(Collectors.toCollection(ArrayList::new));

        return results;
    }

}
