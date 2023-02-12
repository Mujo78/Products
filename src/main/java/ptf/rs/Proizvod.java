package ptf.rs;


public class Proizvod {

    private String naziv;
    private int cijena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public Proizvod(String naziv, int cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }
    public Proizvod() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Proizvod p = (Proizvod) o;
        return this.getNaziv().equals(p.getNaziv());
    }

    @Override
    public String toString() {
        return this.getNaziv() + " " + this.getCijena();
    }
}

