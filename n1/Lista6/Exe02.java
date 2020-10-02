//import java.util.Scanner;
import java.util.Random;

public class Exe02 {
    public static void main(String[] args) {

        Random rand = new Random();

        int menor = 0, maior = 0, linha = 0, colunaMenor = 0, colunaMaior = 0;
        int[][] matriz = new int[4][7];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = rand.nextInt(88) + 11;
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.printf("\n");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j == 0) {
                    menor = matriz[i][j];
                    linha = i;
                    colunaMenor = j;
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linha = i;
                    colunaMenor = j;
                }
            }
        }

        for (int j = 0; j < 7; j++) {
            if (j == 0) {
                maior = matriz[linha][j];
                colunaMaior = j;
            } else if (matriz[linha][j] > maior) {
                maior = matriz[linha][j];
                colunaMaior = j;
            }
        }

        System.out.printf("\n\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == linha && colunaMaior == j)
                    System.out.printf("[%d]", matriz[i][j]);
                else if (i == linha && colunaMenor == j)
                    System.out.printf("[%d]", matriz[i][j]);
                else
                    System.out.printf("[  ]");
            }
            System.out.printf("\n");
        }

        System.out.printf("\nMINMAX");
        System.out.printf("\nMínimo: [%d] na posicao [ij]: [%d%d]", menor, (linha + 1), (colunaMenor + 1));
        System.out.printf("\nMáximo: [%d] na posicao [ij]: [%d%d]", maior, (linha + 1), (colunaMaior + 1));

    }
}
