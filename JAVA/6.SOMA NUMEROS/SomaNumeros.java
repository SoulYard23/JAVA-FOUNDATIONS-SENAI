
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
    Scanner valores = new Scanner(System.in);

    System.out.println("Digite o primeiro numero");
    int num1 = valores.nextInt();

    System.out.println("Digite o segundo numero");
    int num2 = valores.nextInt();

    int soma = num1 + num2;
//Armazena os dois numeros e depois soma

    System.out.println("A soma do resultado é " + soma + "!");

    }

}
