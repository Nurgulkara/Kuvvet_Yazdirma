import java.util.Scanner;

public class Kuvvet_Yazdir {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i, k;
        System.out.print("Sinir sayisini giriniz: ");
        k= inp.nextInt();
        for (i = 1; i <=k; i *=4){
            System.out.println("4'un kuvvetleri: " +i);
        }
        for (i = 1 ; i <=k; i *=5){
            System.out.println("5'in kuvvetleri: " +i);
        }

    }
}
