package ba.unsa.etf.rpr;

import java.util.Objects;

public class Korpa {
    private Artikl[] artikli;
     int ubaceno=0;

    public Korpa(){
        artikli =new Artikl[50];
    }

    public boolean dodajArtikl(Artikl a){
        if(ubaceno==50) return false;
        artikli[ubaceno]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        ubaceno++;
        return true;
    }
    public Artikl[] getArtikli(){
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl pom=null;
        if(getArtikli()!=null)
        for(int i=0; i<ubaceno; i++){
            if(Objects.equals(getArtikli()[i].getKod(), kod)){
                pom=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                if (ubaceno - 1 - i >= 0) System.arraycopy(artikli, i + 1, artikli, i, ubaceno - 1 - i);
                ubaceno--;
                return pom;
            }
        }
        return pom;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0; i<ubaceno; i++) suma=suma+artikli[i].getCijena();
        return suma;
    }
}
