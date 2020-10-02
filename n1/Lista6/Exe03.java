import java.util.Random;

public class Exe03 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[15][5];
        int[][] vet = new int[15 * 5][2];
        int cont = 0, contRepetidos = 0;
        boolean repetiu = false;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(88) + 10;
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.printf("\n");
        }

        // verificando com matriz
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 15; k++) {
                    for (int l = 0; l < 5; l++) {

                        if (i == k && l == j)
                            continue;

                        if (matriz[i][j] == matriz[k][l]) {
                            if (i == 0 && j == 0) {
                                vet[cont][0] = matriz[i][j];
                                contRepetidos++;
                                repetiu = true;
                            } else {
                                for (int m = 0; m <= cont; m++) {
                                    if (matriz[i][j] == vet[m][0])
                                        repetiu = true;
                                }
                            }

                            if (repetiu == false)
                                contRepetidos++;

                            repetiu = false;
                        }
                    }
                }
                if (contRepetidos > 0) {
                    vet[cont][0] = matriz[i][j];
                    vet[cont][1] = contRepetidos + 1;
                    cont++;
                }
                contRepetidos = 0;
            }
        }

        for (int i = 0; i < cont; i++) {
            System.out.printf("\n%d repetiu %d", vet[i][0], vet[i][1]);
        }

        System.out.printf("\n");
    }
}
