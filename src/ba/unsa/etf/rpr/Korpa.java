package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli =null;
   static int ubaceno=0;
    public Korpa(){
        artikli =new Artikl[50];
    }
    public boolean dodajArtikl(Artikl a){
        if(ubaceno==49) return false;
        artikli[ubaceno]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        ubaceno++;
        return true;
    }
    public Artikl[] getArtikli(){
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl pom=null;
        for(int i=0; i<ubaceno; i++){
            if(artikli[i].getKod().equals(kod)){
                pom=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j=i; j<ubaceno-1; j++) artikli[j]=artikli[j+1];
                ubaceno--;
                return pom;
            }
        }
    return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0; i<ubaceno; i++) suma=suma+artikli[i].getCijena();
        return suma;
    }
}
