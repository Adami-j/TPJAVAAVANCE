package TP2;

import java.util.Iterator;
import java.util.Spliterator;

public class FiboIterable implements Iterable<Integer> {

    private int i;

    public FiboIterable(int i) {
        this.i = i;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FiboComparateur(i);
    }

    public static void main(String[] args) {
        FiboIterable fibo = new FiboIterable(50);
        for (int i : fibo) {
            System.out.print(i + " ");
        }
      
    }
}
