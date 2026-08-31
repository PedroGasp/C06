import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        Scanner resposta = new Scanner(System.in);

        System.out.print("Qual foi o numero sorteado ?");
        int resp;
        do{
            resp = resposta.nextInt();
            if (x == resp){
                System.out.println("Acertou!");
            }
            else {
                System.out.println("Errou! Tente novamente.");
                if (resp < x) {
                    System.out.println("O numero e maior!");
                } else
                    System.out.println("O numero e menor!");
            }
        }while (x != resp);
    }
}
