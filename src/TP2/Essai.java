package TP2;

import java.util.Iterator;
import java.util.LinkedList;

public class Essai {

    public static void main (String args[]){
        LinkedList<Integer> liste = new LinkedList <Integer> () ;
        liste.add (3) ;
        liste.add (5) ;
        liste.add (3) ;
        liste.add (12) ;
        liste.add (3) ;
        System.out.println (liste) ;
        liste.remove (3) ;
        System.out.println (liste) ;
        liste.remove (new Integer(3)) ;
        System.out.println (liste) ;
        Iterator <Integer> it = liste.iterator () ;
        while (it.hasNext()) {
            if (it.next() == 3){
                it.remove();
            }
            System.out.println(liste);
        }
        // etape 1 on affiche 3 5 3 12 3
        // etape 2 on sort l'index 3 qui est 12
        // etape 3 on remove un élément qui a pour valeur 3
        //a chaque tout, on supprime 3 si on le trouve et on affiche la liste
    }
}