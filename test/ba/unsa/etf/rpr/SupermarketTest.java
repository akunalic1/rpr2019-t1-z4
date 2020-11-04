package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void testKonstruktora(){
        Supermarket s=new Supermarket();
        assertEquals(1000, s.getArtikli().length);
    }
    @Test
    void dodajArtikl() {
        Supermarket s=new Supermarket();
        s.dodajArtikl(new Artikl("sok", 1, "123"));
        assertEquals("sok", s.getArtikli()[0].getNaziv());
        assertEquals(1, s.getArtikli()[0].getCijena());
        assertEquals("123", s.getArtikli()[0].getKod());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s=new Supermarket();
        for(int i=0; i<10; i++) s.dodajArtikl(new Artikl("nista", 0, "0"));
        for(int i=0; i<10; i++) s.izbaciArtiklSaKodom("0");
        assertEquals(0, s.getBrojDodanih());
    }
}