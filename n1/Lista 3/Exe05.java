import java.util.Scanner;
import java.util.Random;

public class Exe05{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // int[] vetor = new int[30];
        int[] vetor = {1,3,5,2,4,6,7,8,9,10};
        // o retorno para este vetor deve ser: 2,4,6,8,10,5,7,1,9
        int troca = 0;

        for(int i = 0; i < vetor.length; i++){
            // System.out.print("Informe um numero inteiro: ");
            // vetor[i] = scan.nextInt();
            // vetor[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Vetor original");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]: " + vetor[i]);
        }


        // DEU CERTO - MAIS SIMPLES QUE ACHEI - << 5 >> linhas 
        for(int i = 0; i < vetor.length; i++){
            for(int j = i; (j < vetor.length) && vetor[i] % 2 == 1; j++){  
                troca = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = troca;
            } 
        }

        
        // DEU CERTO COM FOR SEM BREAK << 8 >> linhas de codigo 
        /**
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 1){
                troca = vetor[i];
                for(int j = i; troca % 2 == 1 && j < vetor.length; j++){  
                    if(vetor[j] % 2 == 0){
                        troca = vetor[j];
                        vetor[j] = vetor[i];
                        vetor[i] = troca;
                    }
                } 
            }
        }
        */


        // DEU CERTO COM WHILE SEM VARIAVEL BOOLEANA << 11 >> linhas de codigo;
        /**
        int j = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 1){
                troca = vetor[i];
                j = i+1;
                while(troca % 2 == 1 && j < vetor.length){  
                    if(vetor[j] % 2 == 0){
                        troca = vetor[j];
                        vetor[j] = vetor[i];
                        vetor[i] = troca;
                    }
                    j++;
                } 
            }
        }
        */
        

        // DEU CERTO COM WHILE COM VARIAVEL BOOLEANA << 12 >> linhas de codigo
        /**
        int j = 0;
        for(int i = 0; i < vetor.length; i++){
            boolean oopa = false;
            if(vetor[i] % 2 == 1){
                j = i+1;
                while(!oopa && j < vetor.length){  
                    if(vetor[j] % 2 == 0){
                        troca = vetor[j];
                        vetor[j] = vetor[i];
                        vetor[i] = troca;
                        oopa = true;
                    }
                    j++;
                } 
            }
        }
        */


        /**
         * DEU CERTO FOR COM BRAK << 8 >> linhas de codigo;
        **/ 
        /**
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 1){
                for(int j = i+1; j < vetor.length; j++){
                    if(vetor[j] % 2 == 0){
                        troca = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = troca;
                        break;
                    }
                }
            }
        }
        */

        // DEU CERTO COM FUNCAO RECURSIVA << 19 >> linhas de codigo
        // substituir(vetor);

        System.out.println("\n\nVetor modificado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]: " + vetor[i]);
        }
    }

//FUNCOES RECURSIVAS, ajudou a desenvolver a logica!

// funcao de sobrecarga para passar um segundo parametro
public static int[] substituir(int[] vetor){
    return substituir(vetor, 0);
}

public static int[] substituir(int[] vetor, int i){
    if(i < vetor.length){
        if(vetor[i] % 2 == 1){
            par(vetor, i, i);
        } else {
            substituir(vetor, i+1);
        }
    } 
        return vetor;
}

public static void par(int[] vetor, int i, int posicaoImpar){
    int troca = 0;
    if(i < vetor.length){
        if(vetor[i] % 2 == 0){
            troca(vetor, posicaoImpar, i);
        } else {
            par(vetor, i+1, posicaoImpar);
        }
    } else {
        substituir(vetor, i+1);
    }
}

public static void troca(int[] vetor, int posicaoImpar, int posicaoPar){
    int troca = 0;
    troca = vetor[posicaoImpar];
    vetor[posicaoImpar] = vetor[posicaoPar];
    vetor[posicaoPar] = troca;
    substituir(vetor, posicaoImpar++);
}
}

