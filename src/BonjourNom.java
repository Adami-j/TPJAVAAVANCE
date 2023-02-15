public class BonjourNom {

    public static String bonjourNom(String nom){
        String res = "";

        if(nom!=null && !nom.equals("")){
               res=nom;
        }else{
            res="ami";
        }
        if(isUppercase(nom)){
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
