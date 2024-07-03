import java.util.Scanner;

public class Exq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== Exercicio 8 ========");
        System.out.println("Calculadora de carros e motos");
        System.out.println("Informe a quantidade de veículos:");
        int veiculos = sc.nextInt();
        System.out.println("Informe a quantidade de rodas:");
        int rodas = sc.nextInt();
        int calculocarros = (rodas-(2*veiculos))/2;
        int calculomotos = veiculos - calculocarros;
        if (rodas <= veiculos || calculocarros < 0 || calculomotos < 0) {
            System.out.println("Digite um valor válido");
        }
        else{
            System.out.println("A quantidade de carros é "+ calculocarros + ", e a quantidade de motos é "+ calculomotos);
        }
        sc.close();
    }
}