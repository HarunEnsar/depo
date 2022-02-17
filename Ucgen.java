import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        System.out.println("Sırayla üçgenin kenarlarını girip entra basınız.");
        Scanner girdi = new Scanner(System.in);
        int a, b, c;
        a = girdi.nextInt();
        b = girdi.nextInt();
        c = girdi.nextInt();
        System.out.println("Kenarlar:" + a + "," + b + " ve " + c);
        double u = (a + b + c) / 2;
        double alan=Math.sqrt(u * (u - a) * (u - b)*(u - c));
        System.out.println("Alan:"+alan);
    }
}
