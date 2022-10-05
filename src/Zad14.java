import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double marza = 0.4;

        double detalicznaCena;
        System.out.println("Podaj detaliczną cenę płytki: ");
        detalicznaCena = klawiatura.nextInt();
        klawiatura.nextLine();

        double zysk = detalicznaCena - (detalicznaCena * marza);
        System.out.println("Zysk ze sprzedaży tego produkty wynosi " + zysk + "PLN");



    }
}
