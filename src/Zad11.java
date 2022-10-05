import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);



        double przejechaneKilometry;
        System.out.println("Proszę wprowadź liczbę przejechanych kilometrów: ");
        przejechaneKilometry = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Prosze wprowadź liczbę zużytych litrów paliwa: ");
        double zuzytePaliwo = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kilometryNaLitrze = przejechaneKilometry/zuzytePaliwo;


        System.out.println("Kilometry, które pokonasz na jednym litrze paliwa wynoszą:" + kilometryNaLitrze);
    }
}