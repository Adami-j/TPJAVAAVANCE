public class NombreRomain {
    public static String splitNombreRomain(int i) {
        int y =1;
        String res = "";
        if(i==0){
            return "";
        }



        if(i%5==0){
            res+="V";
        }else{
            while(y<=i){
                res+="I";
                y++;
            }
        }


        return res;
    }

}
