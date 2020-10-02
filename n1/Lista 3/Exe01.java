import java.util.Scanner;

public class Exe01
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //int vetor[] = new int[6];
        int[] vetor = {1,5,-5,4,9,-4};
        int quantidadeNegativos = 0;

        for (int i = 0; i < 6; i++)
        {
            // System.out.print((i+1), "o Numero: ");
            // vetor[i] = scan.nextInt();
            if(vetor[i] < 0)
            {
                quantidadeNegativos++;
            }
        }

    System.out.println("Foram informados " + quantidadeNegativos + " numeros negativos");

    }
}