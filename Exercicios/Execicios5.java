package Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Execicios5 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);

        double A= input.nextInt();
                double B = input.nextInt();
                        Double MEDIA = (( A * 3.5) + (B * 7.5 )) / 11.0;

        System.out.printf("MEDIA= %.5f%n", MEDIA);
        input.close();
    }

}
