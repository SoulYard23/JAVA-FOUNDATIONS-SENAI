
import java.util.Scanner;

public class MediaAlunos {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double n1 = teclado.nextDouble();

        System.out.println("Digite a Segunda nota");
        double n2 = teclado.nextDouble();

    //Cria uma variavel "n1/n2" de numero double(numeros reais) e armazena oque foi digitado acima nela

        double media = (n1 + n2) / 2;

        System.out.println("Sua media e " + media);

        if (media >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}