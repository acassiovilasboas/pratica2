import java.util.Scanner;
import java.util.Random;

public class Exe09{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetorK = new int[10];
        int[] vetorN = new int[10];
        int[] vetorM = new int[10];

        for (int i = 0; i < vetorK.length; i++){
            // System.out.print("Informe um valor para vetor K");
            // vetorK[i] = scan.nextInt();
            // System.out.print("Informe um valor para vetor N");
            // vetorN[i] = scan.nextInt();
            vetorK[i] = rand.nextInt(30) + 1;
            vetorN[i] = rand.nextInt(30) + 1;
            vetorM[i] = vetorK[i] - vetorN[i];
        }

        for (int i = 0; i < vetorM.length; i++){
            System.out.println("Posicao [" + (i+1) + "]  " + vetorK[i] + " - " + vetorN[i] + " = " + vetorM[i]);
        }
    }
}