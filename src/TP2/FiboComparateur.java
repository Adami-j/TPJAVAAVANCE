package TP2;

import java.util.Iterator;

public class FiboComparateur implements Iterator<Integer> {

    private int fin = 1;
    private int i = 0;
    private int debut = i;

    public FiboComparateur(int i) {
        this.i = i;

    }

    @Override
    public boolean hasNext() {
        if(fin==1 && debut==1){
            return true;
        }
        return debut+fin<=i?true:false;
    }

    @Override
    public Integer next() {
        int resultat = debut+fin;
        debut = fin;
        fin= resultat;
        return resultat;
    }

    public static void main(String[] args) {
        FiboComparateur fi = new FiboComparateur(15);
        while (fi.hasNext()){
            System.out.println(fi.next());
        }
    }
}
