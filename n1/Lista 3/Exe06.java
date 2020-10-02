import java.util.Scanner;
import java.util.Random;

public class Exe06{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetor = new int[60];
        int contador = 30;
        int troca = 0;

        for (int i = 0; i < vetor.length; i++){
            // System.out.print("Infome um numero inteiro: ");
            // vetor[i] = scan.nextInt();
            vetor[i] = rand.nextInt(100) + 1;
        }

        System.out.println("\n\nVetor original");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]" + vetor[i]);
        }

        for(int i = 0; i < 30; i++){
            troca = vetor[i];
            vetor[i] = vetor[contador];
            vetor[contador] = troca;
            contador++;
        }

        System.out.println("\n\nVetor modificado");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]" + vetor[i]);
        }
    }
}