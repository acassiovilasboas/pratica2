import java.util.Scanner;
import java.util.Random;

public class Exe07{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetor = new int[20];
        int a = rand.nextInt(7) + 1;
        int produtoEscalar = 0;

        // System.out.println("Informe um valor para calcular o produto escalar: ");
        // a = scan.nextInt();

        for(int i = 0; i < vetor.length; i++){
            // System.out.print("Informe um numero inteiro: ");
            // vetor[i] = scan.nextInt();
            vetor[i] = rand.nextInt(100) + 1;

            produtoEscalar += vetor[i] * a;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]: " + vetor[i]);
        }
        System.out.println("\n\nProduto escalar do vetor por " + a + " = " + produtoEscalar);
    }
}