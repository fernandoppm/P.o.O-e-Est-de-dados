import javax.swing.*;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Double menorAltura = Double.MIN_VALUE;
        Double maiorAltura = Double.MIN_VALUE;

        for (int i = 0; i < 14; i++) {
            System.out.println("Digite sua altura: ");

            Double altura = s.nextDouble();
            if (menorAltura > altura) {
                menorAltura = altura;
            }
            if (maiorAltura < altura) {
                maiorAltura = altura;
            }

        }

        System.out.println("A menor altura do grupo é: " + menorAltura);
        System.out.println("A maior altura do grupo é: " + maiorAltura);
    }

}
