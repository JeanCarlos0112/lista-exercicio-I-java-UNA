import java.util.Scanner;

public class Exq7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= Exercicio 7 ========================");
        System.out.println("Calculadora de salário com o acrescimo de ganho a cada venda");
        System.out.println("Por favor, digite o seu sálario:");
        double salario = sc.nextDouble();
        System.out.println("Informe o valor total de vendas no mês:");
        double totalVendas = sc.nextDouble();
        System.out.println("Digite o percentual ganho sobre cada venda:");
        double percentVenda = sc.nextDouble();
        double percenttotalVendas = totalVendas * (percentVenda/100);
        double totalSalario = salario + percenttotalVendas;
        System.out.println("O valor total do salário é: "+ totalSalario);
        sc.close();
    }
    
}
