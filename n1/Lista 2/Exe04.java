import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        // int[] vetorA = new int[10];
        // int[] vetorB = new int[10];

        int[] vetorA = {1,2,5,4,7,6};
        int[] vetorB = {5,8,6,9,1,4,};
        int[] vetorAMaisB = new int[vetorA.length];

        // for(int i = 0; i < vetorA.length; i++){
        //     System.out.print("Vetor A - Infome um valor: ");
        //     vetorA[i] = scan.nextIn();
        //     System.out.print("Vetor B - Infome um valor: ");
        //     vetorB[i] = scan.nextIn();
        // }

        System.out.println("A soma do vetor A com vetor B:");

        for(int i = 0; i < vetorA.length; i++){
            vetorAMaisB[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorA[i] + " + " + vetorB[i] + " = " + vetorAMaisB[i]);
        }
    }
}