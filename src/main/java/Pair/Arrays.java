package Pair;

import java.util.ArrayList;

//public static <___> Pair<E> firstLast(ArrayList<___> a) {
//        }

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays<E> extends Pair {


    public Arrays(Comparable first, Comparable second) {
        super(first, second);
    }

    public static <E extends Comparable> ArrayList<E> firstLast(ArrayList<E> list) {

        ArrayList<E> pairElement = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            pairElement.add(list.get(0));
            pairElement.add(list.get(list.size() - 1));
        }
        return pairElement;
    }

    public Comparable smallest(ArrayList<E> list) {

        return  this.min();
    }

    public Comparable largest(ArrayList<E> list) {

        return  this.max();
    }

    public ArrayList<E> largestSmallest(ArrayList<E> list){

        ArrayList<E> myList = new ArrayList<>();

        myList.add((E) this.min());
        myList.add((E) this.max());

        return myList;
    }
}



