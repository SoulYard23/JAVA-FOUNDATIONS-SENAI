
import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = teclado.nextInt(); 
        //Cria uma variavel "idade" de numero Inteiro(INT) e armazena oque foi digitado acima nela

        if (idade >= 18 ) { //Logica de decisão, se a idade for maior ou menos que 18 mostra alguma coisa
            System.out.println("Voce e maior de idade");
        } else 
         System.out.println("Voce e menor de idade");
        }

}