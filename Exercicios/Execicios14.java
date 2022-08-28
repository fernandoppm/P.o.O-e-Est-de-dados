package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Execicios14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distanciapercorrida = input.nextInt();
        double combustivel = input.nextDouble();

        double combustivelGasto = distanciapercorrida / combustivel;

        System.out.printf("%.3f km/l%n", combustivelGasto);
        input.close();

    }

}
