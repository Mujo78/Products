
import java.util.Scanner;
import ptf.rs.Korpa;
import ptf.rs.Proizvod;


public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int glavniMeni() {
        System.out.println("\t\t -- GLAVNI MENI -- \t\t");
        System.out.println("1. Dodavanje proizvoda");
        System.out.println("2. Brisanje proizvoda");
        System.out.println("3. Ukupna cijena proizvoda u korpi");
        System.out.println("4. Pregled proizvoda");
        System.out.println("5. Ispis po cijeni");
        System.out.println("6. EXIT");
        System.out.print("Izbor: ");
        while (true) {
            try {
                int value = SCANNER.nextInt();
                SCANNER.nextLine();
                return value;
            } catch (Exception ignored) {
                SCANNER.nextLine();
            }
        }
    }



    public static void main(String[] args) throws Exception {
        Korpa kor = new Korpa();
        String naziv;
        int cijena;
        boolean active = true;
        while (active){
            switch (glavniMeni()){
                case 1 -> {
                    System.out.println("--- UNOS PROIZVODA ---");
                    do {
                        System.out.print("Naziv: ");
                        naziv = SCANNER.next();
                        if(naziv.length() == 0 || naziv.equals(null)){
                            System.out.println("Morate unijeti naziv proizvoda!!");
                        }
                    }while(naziv.length() == 0 || naziv.equals(null));

                    do{
                        System.out.print("Cijena: ");
                        cijena = SCANNER.nextInt();
                        if(cijena <= 0){
                            System.out.println("Cijena ne može biti negativna ili jednaka nuli.");
                        }
                    }while (cijena <= 0);
                    Proizvod pro = new Proizvod();
                    pro.setNaziv(naziv);
                    pro.setCijena(cijena);
                    kor.dodajProizvod(pro);
                }
                case 2 -> kor.uklanjanjeProizvoda();
                case 3 -> System.out.print("Ukupna cijena proizovda u korpi je: " + kor.UkupnaCijenaUKorpi() + "\n");
                case 4 -> kor.ispisKorpe();
                case 5 -> kor.IspisNazivaProizvodaKorpeSortiranihPoCijeni();
                case 6 -> active = false;
                default -> System.out.println("ERROR 404");


            }
        }
    }
}
