import java.util.Scanner;

public class EntradaDados {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

    System.out.println("Digete seu nome!");
    String nome = teclado.nextLine();

    System.out.println("olá, " +  nome +"!");
    }

}