package giris;
import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Km bilgisini giriniz: ");
        int km = input.nextInt();

        double ücret = 10 + (km * 2.20);
        boolean minimum = ücret >= 20;
        double tutar = minimum ? ücret : 20;

        System.out.println("Taksimetre tutari: " + tutar);

    }
}
