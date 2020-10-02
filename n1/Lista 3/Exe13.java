import java.util.Scanner;
import java.util.Random;

public class Exe13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vetor = {1,2,-5,8};
        int[] vetorCompacto;
        int contador = 0;

        System.out.println("PREENCHENDO O VETOR");
        for (int i = 0; i < vetor.length; i++){
            // vetor[i] = rand.nextInt(30) + 1;
        }

        System.out.println("VETOR ORIGINAL");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("[ " + vetor[i] + " ]");
        }

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > 0){
                contador++;
            }
        }

        vetorCompacto = new int[contador];
        int j = 0;
        if (contador > 0){
            for (int i = 0; i < vetor.length; i++){
                if (vetor[i] > 0){
                    vetorCompacto[j] = vetor[i];
                    j++;
                }
            }

            System.out.println("NOVO VETOR COM " + vetorCompacto.length + " POSICOES");
            for (int i = 0; i < vetorCompacto.length; i++){
                System.out.println("[ " + vetorCompacto[i] + " ]");
            }
        } else {
            System.out.println("TODOS NUMEROS SAO VALIDS");
        }
    }
}