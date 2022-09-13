import javax.swing.*;
import java.net.SocketOption;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Integer numero = 0;
        Integer quantidade1 = 0;
        Integer quantidade2 = 0;
        Integer quantidade3 = 0;
        Integer quantidade4 = 0;
        Integer quantidadeForaDoIntervalo = 0;

        while (numero >= 0) {

            System.out.println("Digite um numero" );
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            if ((numero <= 0) || (numero > 100)) {
                quantidadeForaDoIntervalo = quantidadeForaDoIntervalo + 1;
            }    else {
                if ((numero >= 0) && (numero <= 25)) {
                    quantidade1 = quantidade1 + 1;
                }

                if ((numero >= 26) && (numero <= 50)) {
                    quantidade2 = quantidade2 + 1;
                }

                if ((numero >= 51) && (numero <= 75)) {
                    quantidade3 = quantidade3 + 1;
                }

                if ((numero >= 76) && (numero <= 100)) {
                    quantidade4 = quantidade4 + 1;
                }
            }

        }

        System.out.println("Quantidade de numero no intervalo dde 0 a 25, é de " + quantidade1);
        System.out.println("Quantidade de numero no intervalo de 25 a 50, é de " + quantidade2);
        System.out.println("Quantidade de numero no intervalo de 50 a 75, é de " + quantidade3);
        System.out.println("Quantidade de numero Fora do intervalo, e de " + quantidadeForaDoIntervalo);

        }

    }


