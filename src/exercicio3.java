import javax.swing.*;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Integer mediaAritimedica = 0;
        Integer qtdVpositivo = 0;
        Integer qtdVnegativos = 0;
        Integer percentualVnegativos;
        Integer percentuslVpositivos;
        Integer soma = 0;
        Integer cont = 0;

        int valorA = 0;
        while (valorA != (1)) {
            System.out.println("Informe o numero positivo: ");
            valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero positivo: "));

            if (valorA >= 0) {
                soma = soma + valorA;
                cont = cont + 1;

                if (valorA % 2 == 0) {
                    qtdVpositivo = qtdVpositivo + 1;
                } else {
                    qtdVnegativos = qtdVnegativos + 1;
                }
            }
        }
        int valorB = 0;
        while (valorB != (-1)) {
            System.out.println("Informe o numero negativo: ");
            valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero negativo: "));

            if (valorB >= 0) {
                soma = soma + valorB;
                cont = cont + 1;

                if ( valorB % 2 == 0) {
                    qtdVpositivo = qtdVpositivo + 1;
                } else {
                    qtdVnegativos = qtdVnegativos + 1;
                }
            }
        }

        mediaAritimedica = soma / cont;

        percentuslVpositivos = qtdVpositivo * 100 / cont;
        percentualVnegativos = qtdVnegativos * 100 / cont;

        System.out.println("A media aritimedica é: ");

        System.out.println("A quantidade de valores lidos positivos é: " + qtdVpositivo);
        System.out.println("A quantidade de valores lidos negativos é: " + qtdVnegativos);

        System.out.println("A percentual de positivos é: " + percentuslVpositivos);
        System.out.println("O percentual de negativos é: " + percentualVnegativos);






    }
}
