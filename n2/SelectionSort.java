import java.util.Random;

public class SelectionSort{
    
    public static void main(String[] args){
        int[] vetor = gerarVetor(5);
        imprimeVetor(vetor);
        for (int i = 0; i < vetor.length; i++){
            int menor = i;
            
            for (int j = i + 1; j < vetor.length; j++)
                if(vetor[j] < vetor[menor])
                    menor = j;

            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        imprimeVetor(vetor);
        System.out.println();
    }

    public static int[] gerarVetor(int n){
        int[] v = new int[n];
        Random rand = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = rand.nextInt(99) + 1;
        return v;
    }

    public static void imprimeVetor(int[] v){
        for(int i : v)
            System.out.printf(" %d ", i);
        System.out.println(); 
    }
}