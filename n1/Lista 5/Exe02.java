import java.util.Scanner;
import java.util.Random;

public class Exe02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int ordemMatriz = 0;
        int somaPrimeiraLinha = 0;
        int somaTerceiraColuna = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int somaTodosElementos = 0;

        while(ordemMatriz < 4){
            System.out.print("Informe a ordem da matriz quadrada [n > 3]: ");
            ordemMatriz = scan.nextInt();
            if (ordemMatriz < 4){
                System.out.println("Valor informado invalido!");
            }
        }

        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rand.nextInt(9) + 1;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaTodosElementos += matriz[i][j];
                if (i == 0){
                    somaPrimeiraLinha += matriz[i][j];
                }
                if (j == 2){
                    somaTerceiraColuna += matriz[i][j];
                }
                if (i == j){
                    somaDiagonalPrincipal += matriz[i][j];
                }
                if (j == (matriz.length - (i+1))){
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Resultados");
        System.out.println("a) Soma da primeira linha......: " + somaPrimeiraLinha);
        System.out.println("b) Soma da terceira coluna.....: " + somaTerceiraColuna);
        System.out.println("c) Soma da diagonal principal..: " + somaDiagonalPrincipal);
        System.out.println("d) Soma da diagonal secundaria.: " + somaDiagonalSecundaria);
        System.out.println("e) Soma de todos elementos.....: " + somaTodosElementos);
    }
}