import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double podatekStanowy = 0.02;
        double podatekLokalny = 0.04;

        int itemPrice;
        System.out.println("Wprowadź wartość kupowanego produktu : ");
        itemPrice = klawiatura.nextInt();
        klawiatura.nextLine();

        double poPodatkuStanowym = itemPrice * podatekStanowy;
        double poPodatkuLokalnym = itemPrice * podatekLokalny;
        double priceAfterTaxes = itemPrice + poPodatkuStanowym + poPodatkuLokalnym;
        System.out.println("Wartość produktu wynosi " + itemPrice + " PLN\n" + "Podatek stanowy wynosi: "+
                poPodatkuStanowym + " PLN\n"+  "Podatek lokalny wynosi: " + poPodatkuLokalnym + " PLN" +"\nŁączna cena sprzedaży to: " + priceAfterTaxes + " PLN");
    }
}






