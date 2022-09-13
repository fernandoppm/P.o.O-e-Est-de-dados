import javax.swing.*;
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i, n;

        System.out.println("Informe um valor de 1 a 10: ");
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor de 1 a 10: "));

        System.out.println();
        for (i=1; i<=10; i++){

            System.out.printf("N x %d = %d%n", i, (n*i));
        }
    }

}

