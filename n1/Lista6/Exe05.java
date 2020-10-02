import java.util.Random;

public class Exe05 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] vetor = new int[18];
        int[][] matriz = new int[3][6];
        int cont = 0, cor = 33;;
        
        for (int i = 0; i < 18; i++)
        {
            vetor[i] = rand.nextInt(8) + 1;
            System.out.printf("[\033[;%dm%d\033[0m]", cor, vetor[i]);
            if(i == 5 || i == 11)
                cor++;
        }

        cor = 33;
    
        System.out.printf("\n\n");
    
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                matriz[i][j] = vetor[cont];
                cont++;
                System.out.printf("[\033[;%dm%d\033[0m]", cor, matriz[i][j]);
            }
            System.out.printf("\n");
            cor++;
        }
    }
}
