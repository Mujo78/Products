package ptf.rs;


import java.util.*;

public class Korpa {
    Scanner scan = new Scanner(System.in);
    List<Proizvod> proizvodi = new ArrayList<>();

    public Korpa() {

    }

    public void dodajProizvod(Proizvod p) {
        for (int i = 0; i < proizvodi.size(); i++) {
            if (proizvodi.get(i).equals(p)) {
                System.out.println("Proizvod vec unesen.");
                return;
            }
        }
        proizvodi.add(p);
        System.out.println("Uspjesno dodavanje proizvoda: " + p.getNaziv());
    }

    public void uklanjanjeProizvoda() {
        String nazivZaUkloniti;
        if (proizvodi.size() == 0) {
            System.out.println("Korpa je prazna.");
        } else {
            ispisKorpe();
            System.out.print("Unesite naziv proizvoda za ukljanjanje: ");
            nazivZaUkloniti = scan.next();
            for (int i = 0; i < proizvodi.size(); i++) {
                if (proizvodi.get(i).getNaziv().equals(nazivZaUkloniti)) {
                    proizvodi.remove(proizvodi.get(i));
                    return;
                }
            }
            throw new RuntimeException("Proizvod se ne nalazi u korpi.");
        }
    }

    public double UkupnaCijenaUKorpi(){
        if (proizvodi.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("Nema proizvoda u korpi.");
        } else {
            int sum = 0;
            for (int i = 0; i < proizvodi.size(); i++) {
                sum = sum + proizvodi.get(i).getCijena();
            }
            return sum;
        }
    }

    public void ispisKorpe() {
        if (proizvodi.size() == 0) {
            System.out.println("Korpa je prazna.");
        } else {
            int brojac = 1;
            System.out.println("Korpa: ");
            for (int i = 0; i < proizvodi.size(); i++) {
                System.out.println(brojac++ + ". " + proizvodi.get(i).toString());
            }
        }
    }

    public void IspisNazivaProizvodaKorpeSortiranihPoCijeni() {
        if (proizvodi.size() == 0) {
            System.out.println("Nema proizvoda u korpi.");
        } else {
            proizvodi.sort(Comparator.comparing(Proizvod::getCijena).reversed());
            proizvodi.forEach(System.out::println);
        }
    }
}



