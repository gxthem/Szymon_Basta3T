import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int firstTest;
        System.out.println("Podaj wynik z pierwszego testu: ");
        firstTest = klawiatura.nextInt();
        klawiatura.nextLine();

        int secondTest;
        System.out.println("Podaj wynik z drugiego testu: ");
        secondTest = klawiatura.nextInt();
        klawiatura.nextLine();

        int thirdTest;
        System.out.println("Podaj wynik z trzeciego testu: ");
        thirdTest = klawiatura.nextInt();
        klawiatura.nextLine();

        double allTogether = firstTest+ secondTest +thirdTest;
        double srednia = allTogether/3;


        System.out.println("Twoje wyniki to: \nPierwszy test: " + firstTest + "\nDrugi test: " + secondTest + "\nTrzeci test: " + thirdTest +"\nA średnia twoich wyników wynosi: " +srednia );
    }
}
