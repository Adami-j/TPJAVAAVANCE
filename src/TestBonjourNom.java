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
        assertEquals("Bonjour, Tic et Tac", BonjourNom.bonjourNom(new ArrayList<String>()));
    }

}
