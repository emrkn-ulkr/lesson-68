import java.util.Scanner;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Dizi uzunluğunu giriniz:");
        int diziUzunluk = in.nextInt();
        in.nextLine();
        int[] dizi = new int[diziUzunluk];
        for (int i = 0; i < diziUzunluk; i++) {
            System.out.print("Dizinin:" + (i + 1) + ". Elemanını Giriniz:");
            dizi[i] = in.nextInt();
        }
        in.nextLine();
        Arrays.sort(dizi);
        System.out.println("Sıralama:"+Arrays.toString(dizi));

    }
}