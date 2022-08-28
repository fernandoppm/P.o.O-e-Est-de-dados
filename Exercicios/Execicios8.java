package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Execicios8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeroFuncionario = input.nextInt();
        int HorasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();
        double salario = HorasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        input.close();
    }
}
