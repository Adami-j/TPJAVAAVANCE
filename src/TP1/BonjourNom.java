package TP1;

import java.util.ArrayList;

public class BonjourNom {



    /**
     * @author Julien ADAMI
     *
     * @return Bonjour, nom ou BONJOUR
     */
    public static String bonjourNom(ArrayList<String> listeDenoms){
        String res = "";
        boolean isFullUpercase = true;
        if(listeDenoms == null||listeDenoms.isEmpty()){
            return "Bonjour, ami";
        }

        ArrayList<String> listeMinuscule = new ArrayList<>();
        ArrayList<String> listeMajuscule = new ArrayList<>();
        for(String nom : listeDenoms) {
            if(isUppercase(nom)){
                listeMajuscule.add(nom);
            }else {
                listeMinuscule.add(nom);
            }
        }

        int i = 1;
        for(String nom : listeDenoms) {
            if(i>1 && i<listeDenoms.size()){
                res+=", ";
            }else if(i>1 && i == listeDenoms.size()){
                res+=" et ";
            }
            if (nom != null && !nom.equals("")) {
                res += nom;
            }else{
                res +="ami";
            }


            if (!isUppercase(nom) || nom.equals(null) || nom.equals("")) {
                isFullUpercase=false;
            }
            i++;
        }

        if(isFullUpercase==true){
            return "BONJOUR, "+res;
        }
        return "Bonjour, "+res;
    }

    public static Boolean isUppercase(String nom){
        for (Character c : nom.toCharArray()){
            if (!Character.isUpperCase(c)){
                return false;
            }
        }
        return true;
    }

}
