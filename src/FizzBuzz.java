public class FizzBuzz {

    /**
     * Calcule le FizzBuzz de i
     * @param i nombre en paramètre
     * @return FizzBuzz de i
     * @author Julien ADAMI
     */
    public static String fizzBuzz(int i) {
        String res="";
        if(i==3){
            res= "Fizz";
        }else {
            res= String.valueOf(i);
        }

        return res;
    }


}
