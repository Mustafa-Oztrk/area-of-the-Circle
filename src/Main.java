import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire Yarı Çapını giriniz : ");
        double yaricap = scanner.nextDouble();
        double alan = Math.PI * yaricap * yaricap;
        System.out.println("Dairenin alanı : " + alan);



    }
}