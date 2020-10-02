import java.util.Scanner;
import java.util.Random;

public class Exe10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] gabarito = new int[5];
        int[] cartaoResposta = new int[5];
        int quantidadeAlunos = 0;
        int acertos = 0;

        System.out.println("PREENCHENDO O GABARITO");
        for (int i = 0; i < gabarito.length; i++){
            // System.out.print("QUESTAO N. " + (i+1) + " RESPOSTA CORRETA: [1 A 5]: ");
            // gabarito[i] = scan.nextInt();
            gabarito[i] = rand.nextInt(5) + 1;
        }

        System.out.println("\n\n###################################\n\n ANALISAR QUANTOS ALUNOS? ");
        quantidadeAlunos = scan.nextInt();

        for(int i = 0; i < quantidadeAlunos; i++){
            acertos = 0;
            System.out.println("------------------------------\nPREENCHENDO CARTAO RESPOSTA DO ALUNO " + (i+1) + ": ");
            for (int j = 0; j < cartaoResposta.length; j++){
                // System.out.print("RESPOSTA " + (j+1) + "[1 A 5]: ");
                // cartaoResposta[j] = scan.nextInt();
                cartaoResposta[j] = rand.nextInt(5) + 1;
            }
            System.out.println("ANALISANDO ALUNO " + (i+1) + ": \n\n        REPOSTA X GABARITO");
            for (int j = 0; j < cartaoResposta.length; j++){
                System.out.println("QUESTAO: " + (j+1) + ": [" + cartaoResposta[j] + "] X [" +  gabarito[j] + "]");
                if(cartaoResposta[j] == gabarito[j]){
                    acertos += 2;
                }
            }
            if (acertos > 4){
                System.out.println("\nRESULTADO\nALUNO N. " + (i+1) + " - SALDO DE PONTOS: " + acertos + " - APROVADO");
            } else {
                System.out.println("\nRESULTADO\nALUNO N. " + (i+1) + " - SALDO DE PONTOS: " + acertos + " - REPROVADO");
            }
            System.out.println("\n");
        }
    }
}
