import java.util.Scanner;

public class Adivinha {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = (int)(Math.random() * 100 + 1); // Cria um número aleatório e o transforma em inteiro
        int tentativa = 0;
        
        System.out.println("**Bem-vindo ao jogo de adivinhação**");
        System.out.println("**Chute um número de 1 a 100**");

        tentativa = scan.nextInt();

        while (tentativa != numero) {
            if (tentativa < numero){
                System.out.println("Errou! O número secreto é maior!");
                tentativa = scan.nextInt();
            } else {
                System.out.println("Errou! O número secreto é menor!");
                tentativa = scan.nextInt();
            }
        }

        System.out.printf("**Parabéns, você acertou, o número secreto era %d**\n", numero);
        
        
        scan.close();
    }
}
