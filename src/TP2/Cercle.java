package TP2;

import java.util.ArrayList;

class Cercle{

    private int x, y ;
    double rayon ;

    public Cercle (int x, int y, double rayon){
        this.x = x ;
        this.y = y ; this.rayon = rayon ;
    }

    public void affiche (){
        System.out.println ("Coordonnées : " + x + ", " + y + " ; rayon : " + rayon) ;
    }

    public double getRayon () {
        return rayon ;
    }

    public int getX () {
        return x ;
    }

    public static void main(String[] args) {
        ArrayList<Cercle> arrayList = new ArrayList<>();
        arrayList.add(new Cercle(0,1,1));
        arrayList.add(new Cercle(8,1,10));
        arrayList.add(new Cercle(100,10,9));
        arrayList.add(new Cercle(5,100,25));

        arrayList.sort(new CercleComparator());
        for (Cercle cercle : arrayList){
            System.out.println(cercle.rayon);
        }

        arrayList.sort(new CercleAbscicesComparator());
        for (Cercle cercle : arrayList){
            System.out.println(cercle.rayon);
        }


    }

}


