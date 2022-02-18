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
        System.out.println("\n\n\nDAİRENİN ALANI");
        int ycap,aci;
        System.out.print("Dairenin yarıçapı:");
        ycap= girdi.nextInt();
        System.out.print("Merkez açsının ölçüsü:");
        aci= girdi.nextInt();
        double pi=3.14;
        double dAlan=(pi*ycap*ycap*aci)/360;
        System.out.println("Dairenin alanı:"+dAlan);





    }
}
