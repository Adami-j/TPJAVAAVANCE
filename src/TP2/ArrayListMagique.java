package TP2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMagique {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(-1);
        arrayList.add(10);
        arrayList.add(-89);


        //1 ordre naturel
        for(int i = 0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        for(Integer in : arrayList){
            System.out.println(in);
        }

        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //2 ordre inverse
        for(int i = arrayList.size()-1; i>=0;i--){
            System.out.println(arrayList.get(i));
        }
        ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()){
            System.out.println("Liste iterator"+listIterator.previous());
        }

        //3 afficher si divisible par 2
        for(Integer i : arrayList){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //4 remplacer les négatif par 0
        for (Integer i : arrayList){
            if(i<0){
                arrayList.set(arrayList.indexOf(i),0);
            }
        }



        System.out.println(arrayList);



    }
}
