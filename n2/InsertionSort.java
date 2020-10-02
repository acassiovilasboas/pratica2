import java.util.Random;

public class InsertionSort {

    public static void main(String[] args){
        int[] vetor = gerarVetor(10);

        imprimeVetor(vetor);

        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i;

            while (j > 0 && vetor[j - 1] >= aux) {
                vetor[j] = vetor[j - 1];
                j--;
            }

            vetor[j] = aux;

        }
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