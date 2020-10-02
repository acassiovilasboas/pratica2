import java.util.Scanner;
import java.util.Random;

public class Exe11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] resultadoCampeanato = new int[13];
        int[] apostas = new int[13];
        int pontos = 0;
        int quantidadeJogadores = 10;

        for (int i = 0; i < resultadoCampeanato.length; i++){
            resultadoCampeanato[i] = rand.nextInt(2);
        }

        for (int i = 0; i < quantidadeJogadores; i++){
            for (int j = 0; j < apostas.length; j++){
                apostas[j] = rand.nextInt(2);

                if(apostas[j] == resultadoCampeanato[j]){
                    pontos++;
                }
            }
            System.out.println("APOSTADOR " + (i+1) + " MARCOU " + pontos + " PONTOS");
            pontos = 0;
        }
    }
}
