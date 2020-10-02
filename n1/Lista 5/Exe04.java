import java.util.Scanner;
import java.util.Random;

public class Exe04{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int quantidadeLinhasMatrizA = 0;
        int quantidadeColunasMatrizA = 0;
        int quantidadeLinhasMatrizB = 0;
        int quantidadeColunasMatrizB = 0;

        do {

            System.out.print("Quantidade de linhas da Matriz A: ");
            quantidadeLinhasMatrizA = scan.nextInt();
            System.out.print("Quantidade de colunas da Matriz A: ");
            quantidadeColunasMatrizA = scan.nextInt();
            System.out.print("Quantidade de linhas da Matriz B: ");
            quantidadeLinhasMatrizB = scan.nextInt();
            System.out.print("Quantidade de colunas da Matriz B: ");
            quantidadeColunasMatrizB = scan.nextInt();

        } while(quantidadeLinhasMatrizA < 1 && 
        quantidadeColunasMatrizA < 1 && 
        quantidadeLinhasMatrizB < 1 &&
        quantidadeColunasMatrizB < 1 &&
        quantidadeColunasMatrizA != quantidadeLinhasMatrizB
        );

        int[][] matrizA = new int[quantidadeLinhasMatrizA][quantidadeColunasMatrizA];
        int[][] matrizB = new int[quantidadeLinhasMatrizB][quantidadeColunasMatrizB];

        int quantidadeLinhasMatrizProduto = quantidadeLinhasMatrizA;
        int quantidadeColunasMatrizProduto = quantidadeColunasMatrizB;

        int[][] matrizProduto = new int[quantidadeLinhasMatrizProduto][quantidadeColunasMatrizProduto];

        for (int i = 0; i < quantidadeLinhasMatrizA; i++){
            for (int j = 0; j < quantidadeColunasMatrizA; j++){
                matrizA[i][j] = rand.nextInt(2) + 1;
            }
        }

        System.out.println("\nMATRIZ A");
        for (int i = 0; i < quantidadeLinhasMatrizA; i++){
            for (int j = 0; j < quantidadeColunasMatrizA; j++){
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < quantidadeLinhasMatrizB; i++){
            for (int j = 0; j < quantidadeColunasMatrizB; j++){
                matrizB[i][j] = rand.nextInt(2) + 1;
            }
        }

        System.out.println("\nMATRIZ B");
        for (int i = 0; i < quantidadeLinhasMatrizB; i++){
            for (int j = 0; j < quantidadeColunasMatrizB; j++){
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println();
        }

        int elemento = 0;
        for (int i = 0; i < quantidadeLinhasMatrizProduto; i++){
            for (int j = 0; j < quantidadeColunasMatrizProduto; j++){
                for (int k = 0; k < quantidadeColunasMatrizA; k++){
                    elemento += matrizA[i][k] * matrizB[k][j];
                }
                matrizProduto[i][j] = elemento;
                elemento = 0;
            }
        }

        System.out.println("\nMATRIZ PRODUTO");
        for (int i = 0; i < quantidadeLinhasMatrizProduto; i++){
            for (int j = 0; j < quantidadeColunasMatrizProduto; j++){
                System.out.print("[" + matrizProduto[i][j] + "] ");
            }
            System.out.println();
        }
        
    }
}