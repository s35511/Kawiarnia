import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone=false;
    private static int kolejnyNumer=1;

    public Zamowienie(KlientKawiarni klient) {
        numerZamowienia=kolejnyNumer;
        this.klient=klient;
        produkty =  new ArrayList<>();
        kolejnyNumer++;
    }
    public void dodajProdukt(ProduktMenu produkt){
        produkty.add(produkt);
    }
    public double policzWartosc(){
        double cena=0.0;
        for(ProduktMenu produkt:produkty){
            cena += produkt.getCena();
        }
        return cena;
    }
    public int policzLiczbeProduktow(){
        return produkty.size();
    }
    public void oznaczJakoOplacone(){
        oplacone=true;
    }
    public static int pobierzKolejnyNumer(){
        return kolejnyNumer++;
    }
    @Override
    public String toString() {
        return "Numer zamowienia: " + numerZamowienia;

    }


}
