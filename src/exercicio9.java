import javax.swing.*;
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Informe o valor inicial: ");
        int A = S.nextInt();

        System.out.println("Informa a razão: ");
        int R = S.nextInt();

        int gn = A, valorMax = 10;

        System.out.printf("Elementos da P.G., de valor inicial %d e razão %d, menores que %d\n", A, R, valorMax );
        while(gn <= valorMax){
            System.out.println(gn);
            gn *= R;
        }
    }
}
