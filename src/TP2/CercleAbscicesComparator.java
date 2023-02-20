package TP2;

import java.util.Comparator;

public class CercleAbscicesComparator implements Comparator<Cercle> {

    @Override
    public int compare(Cercle o1, Cercle o2) {
        int res=0;
        if(o1.getX()>o2.getX()){
            res=1;
        }else if(o1.getX()<o2.getX()){
            res=-1;
        }else{
            res=0;
        }
        return res;
    }

}
