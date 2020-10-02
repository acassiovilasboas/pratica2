import java.util.Scanner;
import java.util.Random;

public class preencherDoisVetores{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetorX = new int[10];
        int[] vetorY = new int[10];
        int[] intersecao = new int[10];
        int posicao = 0;
        boolean controle = false;

        for (int i = 0; i < 10; i++){
            vetorX[i] = rand.nextInt(9) + 1;
            vetorY[i] = rand.nextInt(9) + 1;
        }

        for(int i = 0; i < 10; i++)
            System.out.printf("[%d]", vetorX[i]);
    
        System.out.println();
    
        for(int i = 0; i < 10; i++)
            System.out.printf("[%d]", vetorY[i]);
    
        System.out.println();

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if(vetorX[i] == vetorY[j]){
                    for (int k = 0; k < 10; k++){
                        if(vetorX[i] == intersecao[k])
                            controle = true;
                    }
                    if(!controle){
                        intersecao[posicao] = vetorX[i];
                        posicao++;
                    } 
                    controle = false;   
                }
            }
        }

        for(int i = 0; i < 10; i++)
            System.out.printf("[%d]", intersecao[i]);

        System.out.println();
    }
}