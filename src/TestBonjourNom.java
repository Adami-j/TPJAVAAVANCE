import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBonjourNom {

    @Test
    public void bonjourNomNom(){
        assertEquals("Bonjour Ju",BonjourNom.bonjourNom("Ju"));
    }
}
