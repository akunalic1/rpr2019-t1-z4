package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] uMarketu;
    private int brojDodanih;

    Supermarket(){
        uMarketu=new Artikl[1000];
        brojDodanih=0;
    }
    boolean dodajArtikl(Artikl a){
        if(brojDodanih==99) return false;
        uMarketu[brojDodanih]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        brojDodanih++;
        return true;
    }
    void ispisArtikala(Artikl[] artikli){
        for (Artikl artikl : artikli)
            System.out.println(artikl.getNaziv() + " " + artikl.getCijena() + " " + artikl.getKod());
    }


    public Artikl[] getArtikli() {
        return uMarketu;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
            Artikl pom;
            for(int i=0; i<brojDodanih; i++){
                if(uMarketu[i].getKod().equals(kod)){
                    pom=new Artikl(uMarketu[i].getNaziv(), uMarketu[i].getCijena(), uMarketu[i].getKod());
                    if (brojDodanih - 1 - i >= 0) System.arraycopy(uMarketu, i + 1, uMarketu, i, brojDodanih - 1 - i);
                    brojDodanih--;
                    return pom;
                }
            }
        return null;
    }

    public int getBrojDodanih() {
        return brojDodanih;
    }
}
