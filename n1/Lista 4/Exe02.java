import java.util.Scanner;
import java.util.Random;

public class Exe02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] numerosInteiros = new int[10];
        int[] divisores = new int[5];
        int controle = 0;

        for (int i = 0; i < numerosInteiros.length; i++){
            numerosInteiros[i] = rand.nextInt(30) + 1;
            System.out.print("[ " + retornaZero(numerosInteiros[i]) + " ] ");
        }
        System.out.println();
        for (int i = 0; i < divisores.length; i++){
            divisores[i] = rand.nextInt(10) + 1;
            System.out.print("[ " + retornaZero(divisores[i]) + " ] ");
        }

        System.out.println("\n");

        for (int i = 0; i < numerosInteiros.length; i++){
            System.out.println("Numero " + numerosInteiros[i]);
            for(int j = 0; j < divisores.length; j++){
                if(numerosInteiros[i] % divisores[j] == 0){
                    System.out.println("Divisivel por " + divisores[j] + " na posicao " + (j+1));
                    controle = 1;
                }
            }
            if(controle == 0){
                System.out.println("Nao possui divisores");
            }
            controle = 0;
            System.out.println();
        }
    }

    public static String retornaZero(int numero){
        if( numero < 9){
            return "00" + Integer.toString(numero);
        }
        else if (numero < 99){
            return "0" + Integer.toString(numero);
        }
        return Integer.toString(numero);
    }
}