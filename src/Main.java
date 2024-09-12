import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minTutar=20, acilisUcreti=10;
        float kmBasinaUcret = 2.20f, km, toplamTutar;

        System.out.print("Gidilen mesafeyi km cinsinden giriniz: ");
        km = scanner.nextFloat();

        if(km*kmBasinaUcret < 20) {
            System.out.println("Ödenecek Tutar: " + minTutar);
        } else {
            toplamTutar = (km*kmBasinaUcret)+acilisUcreti;
            System.out.println("Ödenecek Tutar: " + toplamTutar);
        }
    }
}