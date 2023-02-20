package TP2;

import java.util.Comparator;

public class CercleComparator implements Comparator<Cercle> {

    @Override
    public int compare(Cercle o1, Cercle o2) {
        int num = 0;
        if(o1.rayon>o2.rayon){
            num=1;
        }else if(o1.rayon<o2.rayon){
            num=-1;
        }else {
            return 0;
        }
        return num;
    }



}
