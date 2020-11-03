package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void testKonstruktora(){
        Artikl a= new Artikl("auto", 5000, "123");
        assertEquals("auto", a.getNaziv());
        assertEquals(5000, a.getCijena());
        assertEquals("123", a.getKod());
    }
}