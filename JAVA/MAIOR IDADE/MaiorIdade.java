
import java.util.Scanner;

public class MaiorIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua idade?");

        int idade = teclado.nextInt();

        if (idade >= 18 ) {
            System.out.println("Voce e maior de idade");
        } else 
         System.out.println("Voce e menor de idade");
        }

}