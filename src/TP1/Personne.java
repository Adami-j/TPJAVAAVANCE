package TP1;

public class Personne {
    /**
     * @assert age>=0
     */
    private int age;

    public Personne(int age)throws IllegalArgumentException{
        if(age>=0){
            this.age=age;
        }else {
            throw new IllegalArgumentException("L'âge n'est pas positif");
        }

    }

    public static void main(String[] args) {
        Personne personne = new Personne(0);
    }




}
