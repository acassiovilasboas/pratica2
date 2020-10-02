import javax.swing.JOptionPane;
import java.util.Random;

public class selectionSort{
    
    public static void main(String[] args){
        int[] vetor = gerarVetor(10);

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
        for(int i : v){
            System.out.printf(" %d ", i);
        }
        
    }

    
}