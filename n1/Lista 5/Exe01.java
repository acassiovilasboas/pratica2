import java.util.Scanner;

public class Exe01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int ordemMatriz = 0;
        
        System.out.print("Informe a ordem da matriz identidade: ");
        ordemMatriz = scan.nextInt();

        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < ordemMatriz; i++){
            for (int j = 0; j < ordemMatriz; j++){
                if(i == j){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < ordemMatriz; i++){
            for (int j = 0; j < ordemMatriz; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}