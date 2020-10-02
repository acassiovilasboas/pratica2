import java.util.Scanner;

public class Exe03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // int[] valores = new int[6];
        int[] valores = {9,25,99,1,54,47};
        int menorValor = 0;
        int maiorValor = 0;
        int posicaoMaiorValor = 0;
        int posicaoMenorValor = 0;

        for(int i = 0; i < valores.length; i++){
            // System.out.print("Informe um valor inteiro: ");
            // valores[i] = scan.nextInt();

            if(i == 0){
                menorValor = valores[i];
                posicaoMenorValor = i;
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            } else {
                if(valores[i] < menorValor){
                    menorValor = valores[i];
                    posicaoMenorValor = i;
                
                } else if(valores[i] > maiorValor){
                    maiorValor = valores[i];
                    posicaoMaiorValor = i;
                }
            }
        }


        System.out.println("O maior valor no vetor é " + maiorValor + " e está na " + posicaoMaiorValor + " posicao");
        System.out.println("O menor valor no vetor é " + menorValor + " e está na " + posicaoMenorValor + " posicao");
    }
}