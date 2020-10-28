package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] uMarketu=null;
    static int brojDodanih;
    static {
        brojDodanih=0;
    }
    Supermarket(){
        uMarketu=new Artikl[1000];
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
            Artikl pom=null;
            for(int i=0; i<brojDodanih; i++){
                if(uMarketu[i].getKod().equals(kod)){
                    pom=new Artikl(uMarketu[i].getNaziv(), uMarketu[i].getCijena(), uMarketu[i].getKod());
                    for(int j=i; j<brojDodanih-1; j++) uMarketu[j]=uMarketu[j+1];
                    brojDodanih--;
                    return pom;
                }
            }
        return null;
    }
}
