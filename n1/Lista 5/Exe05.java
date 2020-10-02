import java.util.Scanner;
import java.util.Random;

public class Exe05{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int quantidadeLinhas = 0;
        int quantidadeColunas = 0;
    
        System.out.print("Informe a quantidade de linhas: ");
        quantidadeLinhas = scan.nextInt();

        System.out.print("Informe a quantidade de colunas: ");
        quantidadeColunas = scan.nextInt();

        int[] somaColunas = new int[quantidadeColunas];

        int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];

        for(int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = rand.nextInt(4) + 1;
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Soma das colunas");

        for(int i = 0; i < quantidadeColunas; i++)
        {
            for (int j = 0; j < quantidadeLinhas; j++)
            {
                somaColunas[i] += matriz[j][i];
            }
            System.out.printf("[%d]", somaColunas[i]);
        }
        System.out.println();
    }
}