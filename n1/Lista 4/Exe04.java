import java.util.Scanner;
import java.util.Random;

public class Exe04{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetorX = new int[10];
        int[] vetorY = new int[10];
        int testeX = 1;
        int testeY = 1;

        for (int i = 0; i < vetorX.length; i++){
            vetorY[i] = rand.nextInt(10) + 1;
            vetorX[i] = rand.nextInt(10) + 1;
            System.out.println("X = " + vetorX[i] +"  Y = " + vetorY[i]);
        }

        System.out.println("\nUniao dos vetores: ");

        for(int i = 0; i < vetorX.length; i++){
            for (int j = 0; j < vetorY.length; j++){
                if(vetorX[i] == vetorY[j]){
                    testeX = 0;
                }
                if (vetorY[i] == vetorX[j]){
                    testeY = 0;
                }
            }
            if(testeX == 1){
                for(int k = i+1; k < vetorY.length; k ++){
                    if(vetorX[i] == vetorX[k]){
                            testeX = 0;
                        }
                }
            }
            if(testeY == 1){
                for(int k = i+1; k < vetorY.length; k ++){
                    if(vetorY[i] == vetorY[k]){
                        testeY = 0;
                    }
                }
            }
            if(testeX == 1){
                System.out.print("[" + vetorX[i] + "]");
            }
            if(testeY == 1){
                System.out.print("[" + vetorY[i] + "]");
            }
            testeX = 1;
            testeY = 1;
        }

        System.out.println("\n");
    }    
}