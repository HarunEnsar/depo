import java.util.Scanner;

public class Odev40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı girin: ");
        number= input.nextInt();
        System.out.println("4ün kuvvetleri");
        for (int i=1;i<number;i=i*4){

            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("5in kuvvetleri");
        for (int a=1;a<number;a=a*5){

            System.out.print(a+",");
        }
    }
}
