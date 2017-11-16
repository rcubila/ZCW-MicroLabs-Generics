package StackArray;


import java.util.*;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> extends Stack{

    private E [] elements;

    List<E> numbers = new ArrayList<>();

    public GenericStack() {}

    public GenericStack(int size) {

        elements = (E[]) new Object[size];
    }

}
