import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        double result = 0;

        for (int i = 0; i <= 500; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                result += i;
            }
        }
        System.out.println("A soma é: " + result);
    }

    }
