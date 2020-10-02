import java.util.Scanner;
import java.util.Random;

public class Exe12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] resultadoCampeanato = new int[13];
        int[] apostas = new int[13];
        int pontos = 0;
        int quantidadeJogadores = 5000;
        int quantidadeMenorDezPontos = 0;
        float percentualMenorDezPontos = 0;
        int quantidadeDezPontos = 0;
        float percentualDezPontos = 0;
        int quantidadeTrezePontos = 0;
        float percentualTrezePontos = 0;
        int quantidadeOnzeOuDozePontos = 0;
        float percentualOnzeOuDozePontos = 0;

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

            if (pontos < 10) {
                quantidadeMenorDezPontos++;
            }
            else if (pontos == 10) {
                quantidadeDezPontos++;
            }
            else if (pontos == 13) {
                quantidadeTrezePontos++;
            }
            else {
                quantidadeOnzeOuDozePontos++;
            }
            pontos = 0;
        }
        percentualMenorDezPontos = (float) quantidadeMenorDezPontos / quantidadeJogadores * 100;
        percentualOnzeOuDozePontos = (float) quantidadeOnzeOuDozePontos / quantidadeJogadores * 100;
        percentualDezPontos = (float) quantidadeDezPontos / quantidadeJogadores * 100;
        percentualTrezePontos = (float) quantidadeTrezePontos / quantidadeJogadores * 100;
        
        System.out.println("\n\n");

        System.out.println("    *** RELATORIO ***");
        System.out.println(quantidadeMenorDezPontos + " jogadores com menos de 10 pontos, " + percentualMenorDezPontos);
        System.out.println(quantidadeOnzeOuDozePontos + " jogadores com 11 ou 12 pontos, " + percentualOnzeOuDozePontos);
        System.out.println(quantidadeDezPontos + " jogadores com 10 pontos, " + percentualDezPontos);
        System.out.println(quantidadeTrezePontos + " jogadores com 13 pontos, " + percentualTrezePontos);
    }
}