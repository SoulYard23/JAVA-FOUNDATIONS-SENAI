
import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = valores.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = valores.nextInt();

        if (num1 > num2) {
            System.out.println("O " + num1 + " e maior");
        } else if (num1 < num2) {
            System.out.println("O " + num2 + " e maior");
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
