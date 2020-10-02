import java.util.Scanner;

public class Exe01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // float[] notas = new float[10];
        float[] notas = {25, 58, 45, 85, 96, 14, 74, 68, 54, 87};
        float media = 0;
        int notasSuperiorMedia = 0;

        // 1 - Pedido do exercicio
        for (int i = 0; i < notas.length; i++){
            // System.out.print("Informe a nota do " + (i+1) + "o aluno: ");
            // notas[i] = scan.nextFloat();
            
            // 4 - Pedidio do exercicio parte 1 de 2
            media += notas[i];
        }

        media = media / notas.length;

        // 2 - Pedido do exercicio
        System.out.println("\nA diferenca entre a setima nota com valor 60");
        System.out.print("Setima nota: " + notas[6] + "\nDiferenca: " + Math.abs(notas[6] - 60));

        // 4 - Pedidio do exercicio parte 2 de 2
        System.out.println("\n\nA medida de notas: " + media);

        for (int i = 0; i < notas.length; i++){
            // 3 - Pedidio do exercicio
            System.out.println("\nA diferenca entre a nota " + (i+1) + " com valor 60");
            System.out.print("Setima nota: " + notas[i] + "\nDiferenca: " + Math.abs(notas[i] - 60));

            // 5 - Pedido do exercicio parte 1 de 2
            if(notas[i] > media){
                notasSuperiorMedia++;
            }
        }

        // 5 - Pedido do exercicio parte 2 de 2
        System.out.println("\n\nQuantidade de alunos com nota superior a media: " + notasSuperiorMedia);
        

    }
}