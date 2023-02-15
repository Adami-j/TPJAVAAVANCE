import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNombreRomain {

    @Test
    public void nombreRomain(){
        assertEquals("I", NombreRomain.splitNombreRomain(1));
    }
}
