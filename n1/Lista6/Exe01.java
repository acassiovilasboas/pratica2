//import java.util.Scanner;
import java.util.Random;

public class Exe01 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[][] alunos = new int[10][3];
        int menorNota = 0, menorDeTodas = 0, menorN1 = 0, menorN2 = 0, menorN3 = 0, contador = 0, contadorN3 = 0, contadorN2 = 0, contadorN1 = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++)
                alunos[i][j] = rand.nextInt(9) + 1;
        }

        System.out.printf("Aluno\tN1\tN2\tN3\tMENOR NOTA\n");

        for (int i = 0; i < 10; i++) {
            System.out.printf("|%d|\t", i + 1);
            for (int j = 0; j < 3; j++) {
                // menor nota de um aluno
                if (j == 0)
                    menorNota = alunos[i][j];
                else if (alunos[i][j] < menorNota)
                    menorNota = alunos[i][j];
                // menor nota entre todos alunos
                if (j == 0 && i == 0)
                    menorDeTodas = alunos[i][j];
                else if (alunos[i][j] < menorDeTodas)
                    menorDeTodas = alunos[i][j];
                // menor nota N1 entre todos alunos
                if (j == 0 && i == 0)
                    menorN1 = alunos[i][j];
                else if (alunos[i][j] < menorN1 && j == 0)
                    menorN1 = alunos[i][j];
                // menor nota N2 entre todos alunos
                if (j == 1 && i == 0)
                    menorN2 = alunos[i][j];
                else if (alunos[i][j] < menorN2 && j == 1)
                    menorN2 = alunos[i][j];
                // menor nota N3 entre todos alunos
                if (j == 2 && i == 0)
                    menorN3 = alunos[i][j];
                else if (alunos[i][j] < menorN3 && j == 2)
                    menorN3 = alunos[i][j];
                    System.out.printf("|%d|\t", alunos[i][j]);
            }
            System.out.printf("|%d|", menorNota);
            System.out.printf("\n");
        }

        System.out.printf("\n\nRELATORIO FINAL");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if (alunos[i][j] == menorDeTodas)
                    contador++;
                if (alunos[i][j] == menorN3 && j == 2)
                    contadorN3++;
                if (alunos[i][j] == menorN2 && j == 1)
                    contadorN2++;
                if (alunos[i][j] == menorN1 && j == 0)
                    contadorN1++;
            }
        }
        System.out.printf("\n%d alunos tiveram a menor nota de todas com a nota: %d", contador, menorDeTodas);
        System.out.printf("\n%d alunos tiveram a menor nota da N1 com a nota: %d", contadorN1, menorN1);
        System.out.printf("\n%d alunos tiveram a menor nota da N2 com a nota: %d", contadorN2, menorN2);
        System.out.printf("\n%d alunos tiveram a menor nota da N3 com a nota: %d", contadorN3, menorN3);

        System.out.printf("\n");

    }
}