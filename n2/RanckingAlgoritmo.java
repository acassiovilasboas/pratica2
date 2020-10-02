import java.util.Random;

public class RanckingAlgoritmo {

    public static void main(String[] args) {
        int[] vetor = gerarVetor(10000);
        String str = "";

        str += "\nBolha: " + bubble(vetor);
        str += "\nInsert: " + insert(vetor);
        str += "\nSelect: " + selection(vetor);

        out(str);
    }

    public static long bubble(int[] vetor) {
        boolean trocou = false;
        int aux = 0;
        long start = System.currentTimeMillis();
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    trocou = true;
                }
            }
        } while (trocou);
        long elapsed = System.currentTimeMillis() - start;
        return elapsed;

    }

    public static long selection(int[] vetor) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++)
                if (vetor[j] < vetor[menor])
                    menor = j;
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        long elapsed = System.currentTimeMillis() - start;
        return elapsed;
    }

    public static long insert(int[] vetor) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i;
            while (j > 0 && vetor[j - 1] >= aux) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = aux;
        }
        long elapsed = System.currentTimeMillis() - start;
        return elapsed;
    }

    public static int[] gerarVetor(int n) {
        int[] v = new int[n];
        Random rand = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = rand.nextInt(100000) + 1;
        return v;
    }

    public static void out(String str) {
        System.out.println(str);
    }
}
