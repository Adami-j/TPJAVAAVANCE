import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNombreRomain {

    @Test
    public void nombreRomain(){
        assertEquals("I", NombreRomain.splitNombreRomain(1));
    }

    @Test
    public void nombreRomainEgalZero(){
        assertEquals("", NombreRomain.splitNombreRomain(0));
    }

    @Test
    public void nombreRomainEgalTrois(){
        assertEquals("III",NombreRomain.splitNombreRomain(3));
    }
    @Test
    public void nombreRomainEgalQuatre(){
        assertEquals("IIII",NombreRomain.splitNombreRomain(4));
    }

    @Test
    public void nombreRomainEgalCinq() {
        assertEquals("V", NombreRomain.splitNombreRomain(5));
    }

}
