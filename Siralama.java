import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c,enbuyuk=0,ortanca=0,enkucuk=0;
        System.out.print("1.sayıyı girin:");
        a = input.nextInt();
        System.out.print("2.sayıyı girin:");
        b = input.nextInt();
        System.out.print("3.sayıyı girin:");
        c = input.nextInt();
        if (a>c && a>b){
            enbuyuk=a;
            if(b>c){
                ortanca=b;
                enkucuk=c;
            }
            else{
                ortanca=c;
                enkucuk=b;
            }
        }else if(b>a && b>c){
            enbuyuk=b;
            if(a>c){
                ortanca=a;
                enkucuk=c;
            }
            else{
                ortanca=c;
                enkucuk=a;
            }
        }
        else if(c>a && c>b){
            enbuyuk=c;
            if(a>b){
                ortanca=a;
                enkucuk=b;
            }
            else {
                ortanca=b;
                enkucuk=a;
            }


        }

        System.out.println("KÜÇÜKTEN BÜYÜĞE SIRALAMA:"+enkucuk+"<"+ortanca+"<"+enbuyuk);



    }
}
