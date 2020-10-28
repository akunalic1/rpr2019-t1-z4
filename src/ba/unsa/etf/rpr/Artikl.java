package ba.unsa.etf.rpr;

public class Artikl {
    private final String naziv;
     private final  int cijena;
    private final String kod;
    public Artikl(String ime, int cijena, String kod){
        this.naziv=ime;
        this.cijena=cijena;
        this.kod=kod;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }
}
