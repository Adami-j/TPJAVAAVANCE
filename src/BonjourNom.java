public class BonjourNom {

    public static String bonjourNom(String nom){
        String res = "";
        if(nom!=null){
            res=nom;
        }else{
            res="ami";
        }

        return "Bonjour, "+res;


    }

}
