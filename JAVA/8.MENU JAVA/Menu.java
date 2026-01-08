
import java.util.Scanner;

public class Menu {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

    //Cria "menus"
        System.out.println("====== MENU ======"); 
        System.out.println("====== 1.Red ======");
        System.out.println("====== 2.Green ======");
        System.out.println("====== 3.Blue ======");
        System.out.println("====== 4.Yellow ======");
        System.out.println("====== 5.Purple ======");
        System.out.println("====== ESCOLHA UMA OPÇÃO ======");
        
        int opc = teclado.nextInt();
    //Cria uma variavel "opc" de numero Inteiro(INT) e armazena oque foi digitado acima nela

    //Usa uma lógica de escolha aonde o numero qu for escolhido ira apaecer na tela
        switch (opc) {
            case 1 -> System.out.println("====== Red ======");
            case 2 -> System.out.println("====== Green ======");
            case 3 -> System.out.println("====== Blue ======");
            case 4 -> System.out.println("====== Yellow ======");
            case 5 -> System.out.println("====== Purple ======");
                
            default -> System.out.println("====== Opção invalida ======");
        //Caso nenhuma for escolhida
               
        }
    }
}
