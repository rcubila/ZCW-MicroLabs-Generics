package StackArrayList;

import java.util.*;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */


public class Stack<E> {

    private List<E> values = new LinkedList<>();

    public Stack() {
    }

    public <E> boolean isEmpty() throws Exception {

        if (values.isEmpty()) {

            return true;
        }
        return values.isEmpty() ;
    }

    public E pop()throws Exception {

        try {
            return values.remove(0);
        } catch (Exception e){
            throw new EmptyStackException();
        }
    }

    public void push(E e) {

        values.add(0, e);
    }


}


