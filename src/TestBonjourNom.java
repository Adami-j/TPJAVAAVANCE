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


}
