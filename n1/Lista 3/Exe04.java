import java.util.Scanner;
import java.util.Random;

public class Exe04{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetor = new int[20];
        int troca = 0;
        int contador = 19;

        for(int i = 0; i < vetor.length; i++){
            // System.out.print("Informe um numero inteiro: ");
            // vetor[i] = scan.nextInt();
            vetor[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Vetor original");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + (i+1) + "]: " + vetor[i]);
        }

        for(int i = 0; i < 9; i++){
            troca = vetor[i];
            vetor[i] = vetor[contador];
            vetor[contador] = troca;
            contador--;
        }

        System.out.println("\nVetor alterado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + (i+1) + "]: " + vetor[i]);
        }

    }
}
