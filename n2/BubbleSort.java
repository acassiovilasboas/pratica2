import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vetor = gerarVetor(50);
        boolean trocou = false;
        int aux = 0;

        imprimeVetor(vetor);
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    trocou = true;
                }
            }
        } while (trocou);
        imprimeVetor(vetor);
    }

    public static int[] gerarVetor(int n) {
        int[] v = new int[n];
        Random rand = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = rand.nextInt(99) + 1;
        return v;
    }

    public static void imprimeVetor(int[] v) {
        for (int i : v)
            System.out.printf(" %d ", i);
        System.out.println();
    }
}