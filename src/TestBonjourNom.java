import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestBonjourNom {

    private ArrayList<String> listeDenoms = new ArrayList<>();

    @Before
    public void setUp(){

    }

    @Test
    public void bonjourNomNom(){
        listeDenoms.add("Ju");
        assertEquals("Bonjour, Ju",BonjourNom.bonjourNom(listeDenoms));
    }

    @Test
    public void bonjourNull(){
        listeDenoms.add(null);
        assertEquals("Bonjour, ami",BonjourNom.bonjourNom(null));
    }

    @Test
    public void bonjourVide(){
        listeDenoms.add("");
        assertEquals("Bonjour, ami",BonjourNom.bonjourNom(listeDenoms));
    }

    @Test
    public void bonjourHurler(){
        listeDenoms.add("NOUPY");
        assertEquals("BONJOUR, NOUPY",BonjourNom.bonjourNom(listeDenoms));
    }

    @Test
    public void bonjourDemiHurle(){
        listeDenoms.add("Malik");
        assertEquals("Bonjour, Malik",BonjourNom.bonjourNom(listeDenoms));
    }

    @Test
    public void bonjourPlusieursNoms(){
        listeDenoms.add("Tic");
        listeDenoms.add("Tac");
        assertEquals("Bonjour, Tic et Tac", BonjourNom.bonjourNom(listeDenoms));
    }

    @Test
    public void bonjourBeaucoupDeNoms(){
        listeDenoms.add("Ma");
        listeDenoms.add("MA");
        listeDenoms.add("aM");
        listeDenoms.add("Po");
        assertEquals("Bonjour, Ma, MA, aM et Po", BonjourNom.bonjourNom(listeDenoms));
    }

    @Test
    public void bonjourHazard(){
        listeDenoms.add("MAM");
        listeDenoms.add("AMA");
        assertEquals("BONJOUR, MAM et AMA", BonjourNom.bonjourNom(listeDenoms));
    }



}
