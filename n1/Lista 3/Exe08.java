import java.util.Scanner;
import java.util.Random;

public class Exe08{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int produtoVetores = 0;

        for (int i = 0; i <  vetorA.length; i++){
            // System.out.print("Informe um valor para o vetor A:");
            // vetorA[i] = scan.nextInt();
            // System.out.print("Informe um valor para o vetor B:");
            // vetorB[i] = scan.nextInt();
            vetorA[i] = rand.nextInt(30) + 1;
            vetorB[i] = rand.nextInt(30) + 1;
        }

        for(int i = 0; i < vetorA.length; i++){
            produtoVetores += vetorA[i] * vetorB[i];
        }

        System.out.println("\nProduto dos vetores: " + produtoVetores);
    }
}