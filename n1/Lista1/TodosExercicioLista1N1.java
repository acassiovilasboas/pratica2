import java.util.Scanner;
import java.text.DecimalFormat;

public class TodosExercicioLista1N1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int exercicio = 0;

            System.out.print("Exercícios disponíveis:\n");
            System.out.print(" [1] - Progressao Aritmética\n");
            System.out.print(" [2] - Validar uma progressão aritmetica (sem array)\n");
            System.out.print(" [3] - Identificar intervalos [0-25], [26-50], [51-75] e [76-100]\n");
            System.out.print(" [4] - Imprimir e somar a sequencia 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50\n");
            System.out.print(" [5] - Verificar número perfeito\n");
            System.out.print(" [6] - Teste conjunto de 3 números\n");
            System.out.print(" [7] - Tabela de emprestimo\n");
            System.out.print(" [8] - Cinco grupos de quatro valores\n");
            System.out.print(" [9] - Menu de Notas\n");
            System.out.print("[10] - Mostrar numero maior e menor\n\n");
            System.out.print(" [0] - Sair do sistema\n");


            System.out.print("\nInforme sua escolha: ");
            exercicio = scan.nextInt();
            
            System.out.print("\nVoce Selecionou: [");

            switch(exercicio){
                case 1:
                    exe01();
                    break;
                case 2:
                    exe02();
                    break;
                case 3:
                    exe03();
                    break;
                case 4:
                    exe04();
                    break;
                case 5:
                    exe05();
                    break;
                case 6:
                    exe06();
                    break;
                case 7:
                    exe07();
                    break;
                case 8:
                    exe08();
                    break;
                case 9:
                    exe09();
                    break;
                case 10:
                    exe10();
                    break;
                case 0:
                    System.out.println(exercicio + "] Encerrado...");
                    break;
                default:
                System.out.println(+ exercicio + "] Opcao inválida\nEncerrado...");
            
            }

            // System.out.print("\nQuer Acessar um novo Exercicio? [S/N] ");
            System.out.print("\n\n\n");
    }


    static void exe01() {
        System.out.print("Progressao Aritmética]\n\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor inicial: ");
        int valorInicial = scan.nextInt();

        System.out.print("Informe um valor para razão: ");
        int razaoProgressao = scan.nextInt();

        System.out.print("Informe quantidade de elementos: ");
        int quantidadeElementos = scan.nextInt();

        int i = 0;

        System.out.println("\nProgressão aritmética:");

        int valorProgressaoAritmetica = valorInicial;
        System.out.println(valorProgressaoAritmetica);
        for(i = 0; i < quantidadeElementos - 1; i++){
            valorProgressaoAritmetica += razaoProgressao;
            System.out.println(valorProgressaoAritmetica);
        }     

        System.out.print("Informe um valor para razão: ");
        razaoProgressao = scan.nextInt();

        System.out.print("Informe quantidade de elementos: ");
        quantidadeElementos = scan.nextInt();
                
        System.out.println("\nProgressão geométrica:");

        int valorProgressaoGeometrica = valorInicial;
        System.out.println(valorProgressaoGeometrica);
            for(i = 0; i < quantidadeElementos - 1; i++){
            valorProgressaoGeometrica *= razaoProgressao;
            System.out.println(valorProgressaoGeometrica);
        }
    }

    static void exe02(){
        System.out.print("Validar uma progressão aritmetica]\n\n");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int sequencia = 0;
        int razao = 0;
        int termoAnterior = 0;
        boolean prograssaoAritmetica = true;

        System.out.println("Informe uma sequencia de nove números");
        for(i = 0; i < 9; i++){

            if(i > 0){
                termoAnterior = sequencia;
            }
            
            System.out.print((i+1) + "o número: ");
            sequencia = scan.nextInt();

            if(i == 1){
                razao = sequencia - termoAnterior;
            }

            if(i > 0){
                if((sequencia - termoAnterior) != razao){
                    prograssaoAritmetica = false;
                    break;
                }
            }       
        }

        if(prograssaoAritmetica == false){
            System.out.println("Não é uma progressão.");
        } else {
            System.out.println("É uma progressão.");
        }
    }

    static void exe03() {
        System.out.print("Identificar intervalos [0-25], [26-50], [51-75] e [76-100]]\nPara sair informe número negativo\n\n");

        Scanner scan = new Scanner(System.in);

        int numeroTeste = 0;
        int contadorZeroAVinteCinco = 0;
        int contadorVinteSeisACinquenta = 0;
        int contadorCinquentaUmASetentaCinco = 0;
        int contadorSetentaSeiACem = 0;
        int contadorMaiorCem = 0;

        System.out.print("Informe um número inteiro: ");
        numeroTeste = scan.nextInt();

        while(numeroTeste > -1){
            
            if(numeroTeste < 26){
                contadorZeroAVinteCinco++;
            } else if(numeroTeste < 51){
                contadorVinteSeisACinquenta++;
            } else if(numeroTeste < 76){
                contadorCinquentaUmASetentaCinco++;
            } else if(numeroTeste < 101){
                contadorSetentaSeiACem++;
            } else {
                contadorMaiorCem++;
            }
            System.out.print("Informe um número inteiro: ");
            numeroTeste = scan.nextInt();
        }

        System.out.println("***Resultados***");
        System.out.println("[0-25]...: " + contadorZeroAVinteCinco);
        System.out.println("[26-50]..: " + contadorVinteSeisACinquenta);
        System.out.println("[51-75]..: " + contadorCinquentaUmASetentaCinco);
        System.out.println("[76-100].: " + contadorSetentaSeiACem);
        System.out.println("[>100]...: " + contadorMaiorCem);
    }

    static void exe04() {
        System.out.print("Imprimir e somar a sequencia 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50\n");
        int i = 0;
        int dividendo = 1;
        int divisor = 1;
        float resultado = 0;

        for (i = 0; i < 50; i++){
            if(i % 5 == 0){
                System.out.print("\n");
            }
            divisor = i+1;
            if(i == 49){
                System.out.print(dividendo + "/" + divisor + " = ");

            } else {
                System.out.print(dividendo + "/" + divisor + " + ");
            }

            resultado += (float) dividendo/divisor;

            dividendo += 2;
        }


        System.out.print(resultado + "\n\n");

    }

    static void exe05() {
        System.out.println("Verificar número perfeito]\n");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int numeroTeste = 0;
        int divisores = 0;

        System.out.print("Informe um número: ");
        numeroTeste = scan.nextInt();

        for(i = 1; i < numeroTeste; i++){
            if(numeroTeste % i == 0){
                divisores += i;
            }
        }
        
        System.out.println("***Resultado***");

        if(divisores == numeroTeste){
            System.out.println("Número perfeito!");
        } else {
            System.out.println("Sinto muito, númeo não é perfeito!");
        }
    }

    static void exe06() {
        System.out.println("Teste conjunto de 3 números]");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        boolean controlador = true;
        int menorNumero = 0;
        int[] termos = new int[3];

        do {
            System.out.println("\n***Início***");

            for(i = 0; i < 3; i++){
                System.out.print((i+1) + "o termo: " );
                termos[i] = scan.nextInt();
            }
            if(termos[0] < termos[1] && termos[2] > termos[1]){                
                System.out.println("***Resultado***");
                
                System.out.println("Soma.....: " + (termos[0] + termos[1] + termos[2]));
                System.out.println("Produto..: " + (termos[0] * termos[1] * termos[2]));
                System.out.println("Média....: " + (float)(termos[0] + termos[1] + termos[2]) / 3);
            } else {
                controlador = false;
                System.out.println("Encerrando sistema...");
            }
        } while(controlador);
    }

    static void exe07() {
        System.out.println("Cálculo de emprestimo]");

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        int i = 0;
        int quantidadeParcelas = 0;
        float valorParcela = 0;
        float valorDivida = 0;
        float valorJuros = 0;
        int percentualJuros = 0;

        System.out.print("Informe o valor da dívida: ");
        valorDivida = scan.nextInt();

        for(i = 0; i < 12; i++){

            if(i < 2){
                percentualJuros = 0;
            } else if(i < 5){
                percentualJuros = 10;
            } else if(i < 8){
                percentualJuros = 15;
            } else if(i < 11){
                percentualJuros = 20;
            } else {
                percentualJuros = 25;
            }

            valorJuros = (float) valorDivida * percentualJuros / 100;
            valorParcela = (float) (valorDivida + valorJuros) / (i + 1);

            if(((i + 1) % 3 == 0) || i == 0){
                System.out.println("------------------------------------------");
                System.out.println("             ***Simulacao***");
                System.out.println("------------------------------------------");
                System.out.println("VALOR DA DÍVIDA.........: R$ " + df.format((valorDivida + valorJuros)));
                System.out.println("VALOR DOS JUROS.........: R$ " + df.format(valorJuros));
                System.out.println("QUANTIDADE DE PARCELAS..: " + (i + 1) ); 
                System.out.println("VALOR DA PARCELA........: R$ " + df.format(valorParcela)); 
                System.out.println();
            }
        }
    }

    private static int[] crescente(int[] valores){
        return ordenacao(valores, 0, valores.length, false);
    }

    private static int[] decrescente(int[] valores){
        return ordenacao(valores, 0, valores.length, true);
    }

    private static int[] ordenacao(int[] valores, int n, int x, boolean reverse){
        int auxiliar = 0;
        if(x > 0){
            if(valores.length - 1 > n){
                if(reverse){
                    if(valores[n] < valores[n+1]){
                        auxiliar = valores[n+1];
                        valores[n+1] = valores[n];
                        valores[n] = auxiliar;
                    } 
                }else{
                    if(valores[n] > valores[n+1]){
                        auxiliar = valores[n+1];
                        valores[n+1] = valores[n];
                        valores[n] = auxiliar;
                    } 
                }
                return ordenacao(valores, n + 1, x, reverse);
            }
            return ordenacao(valores, n = 0, x - 1, reverse); 
        } 
        return valores;   
    }

    static void exe08() {
        System.out.println("Cinco grupos de quatro valores]\n\n***Captando valores***");
        Scanner scan = new Scanner(System.in);        

        int[][] crescente = new int[5][4];
        int[][] decrescente = new int[5][4];

        for(int i = 0; i < crescente.length; i++){
            System.out.println("[" + (i+1) + "] Conjunto");
            for(int j = 0; j < crescente[i].length; j++){
                System.out.print("Valor de " + (char) (j+65) + ": ");
                int digitado = scan.nextInt();
                crescente[i][j] = digitado;
                decrescente[i][j] = digitado;
            }
        }

        for(int i = 0; i < decrescente.length; i++){
            decrescente[i] = decrescente(decrescente[i]);
        }

        for(int i = 0; i < crescente.length; i++){
            crescente[i] = crescente(crescente[i]);
        }

        System.out.println("\n\nOrdem Cresente: ");

        for(int i = 0; i < crescente.length; i++){
            System.out.print("[" + (i+1) + "] Conjunto: ");
            for(int j = 0; j < crescente[i].length; j++){
                System.out.print(crescente[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n\nOrdem Decresente: ");

        for(int i = 0; i < decrescente.length; i++){
            System.out.print("[" + (i+1) + "] Conjunto: ");
            for(int j = 0; j < decrescente[i].length; j++){
                System.out.print(decrescente[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n\nEncerrando sistema...");
    }

    static void exe09() {
        /**
        Faça um programa que apresente o menu de opções a seguir:
        Menu de opções:
        1. Média aritmética
        2. Média ponderada
        3. Sair
        Digite a opção desejada.
        Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
        Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
        Na opção 3: sair do programa.
        Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma
        mensagem. */
    
        System.out.println("Menu de Notas]");
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float peso1 = 0;
        float peso2 = 0;
        float peso3 = 0;
        float media = 0;

        while(opcao != 3){
            opcao = 0;
            System.out.println("\n\nMenu de opcoes:");
            System.out.println("[1] - Media aritmetica");
            System.out.println("[2] - Media ponderada");
            System.out.println("[3] - Sair");
            System.out.print("\nDigite sua opcao: ");
            opcao = scan.nextInt();
            if(opcao == 1){
                System.out.print("Informe a nota 1: ");
                nota1 = scan.nextFloat();
                System.out.print("Informe a nota 2: ");
                nota2 = scan.nextFloat();
                System.out.print("A media é: " + (nota1 + nota2) / 2);
            } 
            else if(opcao == 2){    
                System.out.print("Informe a nota 1: ");
                nota1 = scan.nextFloat();
                System.out.print("Informe o peso da nota 1: ");
                peso1 = scan.nextFloat();
                System.out.print("Informe a nota 2: ");
                nota2 = scan.nextFloat();
                System.out.print("Informe o peso da nota 2: ");
                peso2 = scan.nextFloat();
                System.out.print("Informe a nota 3: ");
                nota3 = scan.nextFloat();
                System.out.print("Informe o peso da nota 3: ");
                peso3 = scan.nextFloat();
                media = ((nota1 * peso2) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
                System.out.println("Media ponderada: " + media);
            } 
            else if (opcao == 3){
                System.out.println("Encerrando sistema...");
            } 
            else {
                System.out.println("Opcao invalida, tente novamente");
            }            
        }
    }

    static void exe10() {
        System.out.println("Mostrar numero maior e menor]");

        Scanner scan = new Scanner(System.in);
        int numeroMaior = 0;
        int numeroMenor = 0;
        int numeroDigitado = 0;
        int contador = 0;

        System.out.print("\nInforme um número inteiro: ");
        numeroDigitado = scan.nextInt();

        while(numeroDigitado != 0){
            if(numeroDigitado < 0){
                System.out.println("Numero negativo, NÃO CALCULADO");
            } else if(contador == 0){
                numeroMenor = numeroDigitado;
                numeroMaior = numeroDigitado;
                contador++;
            } else if(numeroDigitado < numeroMenor){
                numeroMenor = numeroDigitado;
            } else if(numeroDigitado > numeroMaior){
                numeroMaior = numeroDigitado;
            }           
            System.out.print("Informe um número inteiro: ");
            numeroDigitado = scan.nextInt();
        }
        System.out.println("\n\nMenor número informado: " + numeroMenor);
        System.out.println("Maior número informado: " + numeroMaior);
    }
}