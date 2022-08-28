package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Execicios10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cdPeca1 = input.nextInt();
        int nmPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();
        int cdPeca2 = input.nextInt();
        int nmPeca2 = input.nextInt();
        double valorPeca2= input.nextDouble();

        double custototal = nmPeca1 * valorPeca1 + nmPeca2 * valorPeca2;
        System.out.printf("VALOR A PAGAR : R$ %.2f%n", custototal);

        input.close();
    }
}
