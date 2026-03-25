import java.util.Objects;

public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria, int liczbaProduktow){
        this.kod=kod;
        this.nazwa=nazwa;
        this.cena=cena;
        this.kategoria=kategoria;
        liczbaProduktow++;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public static int numberOfProducts(){
        return liczbaProduktow;
    }

    @Override
    public String toString(){
        return "Kod: " + this.kod
                + "\nNazwa: " + this.nazwa
                + "\nCena: " + this.cena
                + "\nKategoria: " + this.kategoria;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProduktMenu that = (ProduktMenu) o;
        return Objects.equals(kod, that.kod);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }

}
