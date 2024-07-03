import java.util.Scanner;

public class Exq2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== Exercicio 2 ======================");
        System.out.println("Calculadora que processa o acrescimo de 10% sobre o valor.");
        System.out.println("Por favor, informe um valor:");
        double numeroUm = sc.nextDouble();
        double resultado = (numeroUm * 10/100) + numeroUm;
        System.out.println("O resultado é: " + resultado);
        sc.close();
    }    
}
