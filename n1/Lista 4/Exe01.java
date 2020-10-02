import java.util.Scanner;
import java.util.Random;

public class Exe13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // float[] valorUnitario = new float[10];
        int[] valorUnitario = new int[10];
        int[] quantidadeVendida = new int[10];
        float totalVendas = 0;
        float totalVenda = 0;
        
        for (int i = 0; i < valorUnitario.length; i++){
            // System.out.print("Informe o valor unitario: ");
            // valorUnitario[i] = scan.nextInt();
            // System.out.print("Infome a quantidade vendida: ");
            // quantidadeVendida[i] = scan.nextInt();
            
            valorUnitario[i] = rand.nextInt(100) + 1;
            quantidadeVendida[i] = rand.nextInt(30) + 1;
        }

        for (int i = 0; i < valorUnitario.length; i++){
            totalVenda = valorUnitario[i] * quantidadeVendida[i];
            System.out.println("----------------------------------------");
            System.out.println(
                "Produto..............: " + (i+1) + 
                "\nQuantidade Vendida...: " + quantidadeVendida[i] +  
                "\nValor Unitário.......: R$ " + valorUnitario[i] + 
                "\nValor Total..........: R$ " + totalVenda);
            totalVendas += valorUnitario[i] * quantidadeVendida[i];
        }

        System.out.println("#######################################");
        System.out.println("##########      RELATORIO     #########");
        System.out.println("Valor total em vendas............: R$ " + totalVendas);
        System.out.println("Comissao de vendas...............: R$ " + (totalVendas * 5 / 100));
        System.out.println("Salario fixo.....................: R$ 545.00");
        System.out.println("Total a receber..................: R$ " + (545 + totalVendas * 5 / 100));
        
    }
}