import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;
    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public void daneKlienta(){
        System.out.println("Id klienta: " + idKlienta + " Imie : " + imie + " Nazwisko: " + nazwisko + " Email: " + email);
    }
    @Override
    public String toString() {
        return "Id klienta: " + this.idKlienta +  " Imie : " + this.imie + " Nazwisko: " + this.nazwisko +  " Email: " + this.email;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlientKawiarni that = (KlientKawiarni) o;
        if(this.idKlienta != that.idKlienta) return false;
        return Objects.equals(this.email, that.email);
    }
    @Override
    public int hashCode() {
        if(idKlienta != 0){
            return Objects.hash(idKlienta);
        }
        return Objects.hash(email);
    }


}
