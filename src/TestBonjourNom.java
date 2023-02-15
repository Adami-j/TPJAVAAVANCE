import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBonjourNom {

    @Test
    public void bonjourNomNom(){
        assertEquals("Bonjour, Ju",BonjourNom.bonjourNom("Ju"));
    }

    @Test
    public void bonjourNull(){
        assertEquals("Bonjour, ami",BonjourNom.bonjourNom(null));
    }

    @Test
    public void bonjourVide(){
        assertEquals("Bonjour, ami",BonjourNom.bonjourNom(""));
    }

    @Test
    public void bonjourHurler(){
        assertEquals("BONJOUR, NOUPY",BonjourNom.bonjourNom("NOUPY"));
    }


}
