import java.util.Scanner;

public class Exe02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetor = {1,25,8,14,7,65,25,3,9,2};
        // int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            //System.out.print("Informe um valor: ");
            //vetor[i] = scan.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 11){
                System.out.println("Posicao: [" + (i+1) + "] - Valor: " + vetor[i]);
            }
        }
    }
}