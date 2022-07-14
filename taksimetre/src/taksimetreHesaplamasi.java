import java.util.Scanner;

public class taksimetreHesaplamasi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner (System.in);

        int km;
        double perKm = 2.20, total, startPrice=10;

        System.out.print("Gidilen mesafeyi giriniz: ");
        km= girdi.nextInt();

        total = (km * perKm);

        total += startPrice;

        System.out.println("Toplam Tutar: " +total);
        System.out.print("iyi gunler");
    }
}
