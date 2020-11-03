package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodaj1Artikl() {
        Korpa k=new Korpa();
        Artikl a=new Artikl("nesto", 100, "123");
        k.dodajArtikl(a);
        assertEquals(1, Korpa.ubaceno);
    }
    @Test
    void dodaj50Artikala(){
        Korpa k=new Korpa();
        Artikl a=new Artikl("nesto", 100, "123");
        for(int i=0; i<49; i++) k.dodajArtikl(a);
        boolean iskaz=k.dodajArtikl(a);
        assertFalse(iskaz);
    }


}