public class NombreRomain {
    public static String splitNombreRomain(int i) {
        int y =1;
        String res = "";
        if(i==0){
            return "";
        }

        while(y<=i){
            res+="I";
            y++;
        }
        return res;
    }

}
