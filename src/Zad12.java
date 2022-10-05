import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {

    int cookieBox = 40;
    int portions = 10;
    int calories = 300;

        Scanner klawiatura = new Scanner(System.in);
        int eatenCookies;
        System.out.println("Proszę wprowadź liczbę zjedzonych ciastek: ");
        eatenCookies = klawiatura.nextInt();
        klawiatura.nextLine();

        double caloriesEatenByPerson = (double)eatenCookies / cookieBox * portions * calories;
        System.out.println("Spożyłeś " + caloriesEatenByPerson + " kalorii");

    }




}
