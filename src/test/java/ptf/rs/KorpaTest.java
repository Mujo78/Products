package ptf.rs;

import java.util.ArrayList;
import java.util.List;


public class KorpaTest {

    @org.junit.Test
    public void dodajProizvod() {
        Korpa k = new Korpa();
        Proizvod p = new Proizvod("A", 1);
        k.dodajProizvod(p);
        k.dodajProizvod(p);
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void uklanjanjeProizvoda() {
        Korpa k = new Korpa();
        Proizvod p = new Proizvod("A", 2);
        String naziv = "B";
       k.proizvodi.add(p);
        for (int i = 0; i < k.proizvodi.size(); i++) {
            if (k.proizvodi.get(i).getNaziv().equals(naziv)) {
                k.proizvodi.remove(k.proizvodi.get(i));
                return;
            }
        }
        throw new RuntimeException("Proizvod se ne nalazi u korpi.");

    }

    @org.junit.Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ukupnaCijenaUKorpi() {
        List<Proizvod> proizvodList = new ArrayList<>();
        if(proizvodList.size() == 0){
            throw new ArrayIndexOutOfBoundsException("Korpa prazna");
        }
    }

    @org.junit.Test
    public void ispisKorpe() {
        Korpa k = new Korpa();
        Proizvod p = new Proizvod("A", 1);
        k.proizvodi.add(p);
        k.ispisKorpe();
    }

    @org.junit.Test
    public void ispisNazivaProizvodaKorpeSortiranihPoCijeni() {
        Korpa k = new Korpa();
        Proizvod p = new Proizvod("A", 1);
        Proizvod p2 = new Proizvod("B", 2);
        k.proizvodi.add(p);
        k.proizvodi.add(p2);
        k.IspisNazivaProizvodaKorpeSortiranihPoCijeni();
    }
}