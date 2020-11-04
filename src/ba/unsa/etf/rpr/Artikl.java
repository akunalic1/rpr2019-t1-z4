package ba.unsa.etf.rpr;

public class Artikl {
    private  String naziv;
    private  int cijena;
    private  String kod;

    public Artikl(){
        naziv="";
        cijena=0;
        kod="";
    }
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
