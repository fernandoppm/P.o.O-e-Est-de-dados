package Exercicios;
import java.util.Scanner;

public class Execicios7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = " + DIFERENCA);
        input.close();

    }
}

