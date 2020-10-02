//import java.util.Random;

public class Exe04 {
    public static void main(String[] args){
        //Random rand = new Random();
        int[][] matriz = {{2,4,4},{4,6,6},{4,6,9}};
        //int[][] matriz = new int[8][8];
        boolean simetrica = true;
    
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                //matriz[i][j] = rand() % 8 + 1;
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%d %d = %d %d | %d = %d\t", i,j,j,i,matriz[i][j], matriz[j][i]);
                if(matriz[i][j] != matriz[j][i])
                {
                    simetrica = false;
                }
            }
            System.out.printf("\n");
        }
    
        if(simetrica)
        {
            System.out.printf("Matriz simetrica");
        }
        else
        {
            System.out.printf("Matriz nao e simetrica");
        }
    }
}
