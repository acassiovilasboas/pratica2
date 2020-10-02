import java.util.Scanner;
import java.util.Random;

public class CorrigirProva{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] gabarito = new int[8];
        int[][] alunos = new int[10][10];
        int pontos = 0;
        float percentualAprovado = 0;

        System.out.print("INFORME AS RESPOSTAS CORRETAS PARA O GABARITO\n");

        for (int i = 0; i < gabarito.length; i++){
            System.out.printf("PERGUNTA NRO %d: ", (i+1));
            gabarito[i] = scan.nextInt();
            // gabarito[i] = rand.nextInt(5) + 1;
            // System.out.printf("[%d]", gabarito[i]);
        }

        for (int i = 0; i < alunos.length; i++){
            for (int j = 0; j < alunos[i].length - 1; j++){
                if(j == 0){
                    System.out.printf("INFORME A MATRICULA DO ALUNO NRO %d", (i+1));
                    alunos[i][j] = scan.nextInt();
                    // alunos[i][j] = rand.nextInt(10) + 1;
                } else {
                    System.out.printf("RESPOSTA PARA %do PERGUNTA ", (j+1));
                    alunos[i][j] = scan.nextInt();
                    // alunos[i][j] = rand.nextInt(5) + 1;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < alunos.length; i++){
            for (int j = 1; j < alunos[i].length - 1; j++){ 
                    if(gabarito[j-1] == alunos[i][j]){
                        pontos++;
                }
            }
            alunos[i][9] = pontos;
                pontos = 0;
        }
        
        System.out.println("\nMATRICULA\tRESPSOTAS\tPONTOS\tRESULTADO");

        for (int i = 0; i < alunos.length; i++){
            System.out.printf("[%d]\t", alunos[i][0]);
            for(int j = 1; j < alunos[i].length - 1; j++){
                System.out.printf("[%d]", alunos[i][j]);
            }
            System.out.print(" = " + alunos[i][alunos[i].length-1]);
            if(alunos[i][alunos[i].length-1] > 5){
                System.out.print("  APROVADO \n");
                percentualAprovado++;
            } else {
                System.out.print("  REPROVADO\n");
            }
        }

        percentualAprovado = percentualAprovado / alunos.length * 100;
        System.out.println(percentualAprovado + "% DE ALUNOS APROVADOS");
    }
}