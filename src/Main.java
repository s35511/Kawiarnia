public class Main {
    public static void main(String[] args) {
        ProduktMenu produkt1 = new ProduktMenu("123", "Kawa", 5.0, "Napoj" , 1);
        ProduktMenu produkt2 = new ProduktMenu("124", "herbata", 4.0, "Napoj",1);
        ProduktMenu produkt3 = new ProduktMenu("125", "sok pomaranczowy", 6.0, "Napoj", 1);
       System.out.println(produkt1.toString());
       System.out.println(produkt1.equals(produkt2));

    }
}