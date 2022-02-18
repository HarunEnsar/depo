import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        System.out.println("Manav Kasa Programı");
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,tutar;
        System.out.print("Kaç kilo Armut:");
        armut=input.nextDouble();
        System.out.print("Kaç kilo Elma:");
        elma=input.nextDouble();
        System.out.print("Kaç kilo Domates:");
        domates=input.nextDouble();
        System.out.print("Kaç kilo Muz:");
        muz=input.nextDouble();
        System.out.print("Kaç kilo Patlıcan:");
        patlican=input.nextDouble();
        tutar=(2.14)*armut+(3.67)*elma+(1.11)*domates+(0.95)*muz+(5.00)*patlican;
        System.out.print("TUTAR:"+tutar);
    }
}
