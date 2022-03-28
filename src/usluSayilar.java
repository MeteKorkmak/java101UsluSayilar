import java.util.Scanner;
public class usluSayilar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;

        System.out.print("Üssü alınacak sayıyı giriniz:");
        a= input.nextInt();
        System.out.print("Üssü Giriniz:");
        b=input.nextInt();
        int toplam=1;

        for (int i=1; i<=b; i++){
            toplam=toplam*a;

        }
        System.out.print("Cevap:"+toplam);

    }
}
