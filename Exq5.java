import java.util.Scanner;
public class Exq5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================= Exercicio 5 =================");
        System.out.println("Calculadora de salário bruto e salário familia");
        System.out.println("Por favor, digite as horas trabalhadas:");
        double horas = sc.nextDouble();
        System.out.println("Por favor, digite o valor recebido por hora:");
        double valorHoras = sc.nextDouble();
        System.out.println("Por favor, digite o valor do salário familia:");
        double valorsalarioFamilia= sc.nextDouble();
        System.out.println("Por favor, digite o número de filhos menores que 14 anos:");
        double numerodefilhos = sc.nextDouble();
        double salarioBruto = valorHoras * horas;
        double salarioFamilia = valorsalarioFamilia * numerodefilhos; 
        System.out.println("O valor do salário bruto é R$" + salarioBruto + " e do salário familia é R$" + salarioFamilia);
        sc.close();
    }
}
