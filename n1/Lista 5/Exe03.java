import java.util.Scanner;
import java.util.Random;

public class Exe03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int ordemMatriz = 0;
        System.out.print("Informe a ordem da matriz: ");
        ordemMatriz = scan.nextInt();

        int[][] matriz = new int[ordemMatriz][ordemMatriz];
        int[][] matrizB = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rand.nextInt(9) + 1;
                if(matriz[i][j] % 2 == 0){
                    matrizB[i][j] = 0;
                } else {
                    matrizB[i][j] = 1;
                }
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println("Matriz B");
        for (int i = 0; i < matrizB.length; i++){
            for (int j = 0; j < matrizB[i].length; j++){
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println();
        }
    }
}