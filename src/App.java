import bangunruang.Bola;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Menghitung Luas dan Volume Bola");
        System.out.println("\n==================================\n");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukkan Panjang Jari-Jari (r) : ");
        Bola bola1 = new Bola();
        bola1.r = keyboard.nextInt();
        bola1.Bola();
    }
}
