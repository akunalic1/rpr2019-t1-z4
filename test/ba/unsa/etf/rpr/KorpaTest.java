package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodaj1Artikl() {
        Korpa r=new Korpa();
        Artikl a=new Artikl("nesto", 100, "123");
        r.dodajArtikl(a);
        assertEquals(1, r.ubaceno);
    }
    @Test
    void dodaj50Artikala(){
        Korpa k=new Korpa();
        Artikl a=new Artikl("nesto", 100, "123");
        for(int i=0; i<50; i++) k.dodajArtikl(a);
        boolean iskaz=k.dodajArtikl(a);
        assertFalse(iskaz);
    }
    @Test
    void testVelicine(){
        Korpa k=new Korpa();
        Artikl a=new Artikl("nesto", 100, "123");
        for(int i=0; i<10; i++) k.dodajArtikl(a);
        assertEquals(10, k.ubaceno);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k=new Korpa();
        Artikl a=new Artikl("nesto", 100, "123");
        for(int i=0; i<10; i++) k.dodajArtikl(a);
        for(int i=0; i<10; i++) k.izbaciArtiklSaKodom("123");
        assertEquals(0, k.ubaceno);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k=new Korpa();
        for(int i=0; i<50; i++) k.dodajArtikl(new Artikl("nesto", 100, "123"));
        assertEquals(5000, k.dajUkupnuCijenuArtikala());
    }
}