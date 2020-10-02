import java.util.Scanner;
import java.util.Random;

public class Exe03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetor = new int[50];
        int menorNumero = 0;
        int posicaoMenorNumero = 0;

        for (int i = 0; i < vetor.length; i++){
            // System.out.print("Informe um numero: ");
            // vetor[i] = scan.nextInt();
            vetor[i] = rand.nextInt(100) + 1;
            System.out.println("[" + (i+1) + "]: " + vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++){
            if (i == 0){
                menorNumero = vetor[i];
                posicaoMenorNumero = i + 1;
            } else if (vetor[i] < menorNumero){
                menorNumero = vetor[i];
                posicaoMenorNumero = i + 1;
            }
        }
        System.out.println("O menor numero encontrado: " + menorNumero + " na posicao: [" + posicaoMenorNumero + "]");
    }
}