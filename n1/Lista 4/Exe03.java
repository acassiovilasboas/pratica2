import java.util.Scanner;

public class Exe03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroTeste = 100;
        int termosPrimo = 0;
        int i = 2;

        while(termosPrimo < 100000){
            while(numeroTeste % i != 0 && i < numeroTeste){
                if (i == (numeroTeste - 1)){
                    System.out.println((termosPrimo+1) + "o NUMERO PRIMO: " + numeroTeste);
                    termosPrimo++;
                }
                i++;
            }
            numeroTeste++;
            i = 2;
        }
    }
}


