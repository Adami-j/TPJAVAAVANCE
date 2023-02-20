package TP2;

import java.util.Iterator;

public class FiboComparateur implements Iterator<Integer> {
    private int debut = 0;
    private int fin = 1;
    private int i = 0;

    public FiboComparateur(int i) {
        this.i = i;
    }

    @Override
    public boolean hasNext() {
        return debut!=fin?true:false;
    }

    @Override
    public Integer next() {
        return ;
    }

}
