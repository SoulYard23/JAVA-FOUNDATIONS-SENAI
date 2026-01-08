import java.util.Scanner;

public class EntradaDados {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in); //Insere os comandos do teclado

    System.out.println("Digete seu nome!"); 
    String nome = teclado.nextLine(); //Cria uma variavel "nome" e armazena oque foi digitado acima nela

    System.out.println("olá, " +  nome +"!");
    }

}