import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.print("Insira sua NPA: ");
        Scanner entrada = new Scanner(System.in);
        int NPA = entrada.nextInt();
        if (NPA >= 60){
            System.out.print("APROVADO!");
        } else if (NPA < 30) {
            System.out.println("REPROVADO!");
        }
        else {
            System.out.println("Precisa fazer NP3");
            System.out.print("Escreva sua nota da NP3: ");
            int NP3 = entrada.nextInt();
            if (((NPA + NP3)/2) >= 50){
                System.out.println("APROVADO!");
            }
            else
                System.out.println("REPROVADO!");
        }
    }
}