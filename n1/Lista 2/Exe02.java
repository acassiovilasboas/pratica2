import java.util.Scanner;

public class Exe02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //int[] numeros = new int[8];
        int[] numeros = {10,54,23,2,1,7,99,10};
        int somaValoresPares = 0;
        int somaPosicoesPares = 0;
        int somaTodos = 0;
        int somaValoresAcimaMedia = 0;
        float media = 0;

        for(int i = 0; i < numeros.length; i++){
            // System.out.print("Informe um valor: ");
            // numeros[i] = scan.nextInt();
            if(numeros[i] % 2 == 0){
                somaValoresPares += numeros[i];
            }
            if(i % 2 == 0){
                somaPosicoesPares += i;
            }
            media += numeros[i];
            somaTodos += numeros[i];
        }

        media = media / numeros.length;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > media){
                somaValoresAcimaMedia += numeros[i];
            }
        }

        System.out.println("Soma de todos elementos: " + somaTodos);
        System.out.println("Soma dos elementos pares: " + somaValoresPares);
        System.out.println("Soma das posicoes pares: " + somaPosicoesPares);
        System.out.println("Soma dos elementos acima da media: " + somaValoresAcimaMedia);
    }
}