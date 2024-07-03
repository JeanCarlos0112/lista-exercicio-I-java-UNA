import java.util.Scanner;

public class Exq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================== Exercicio 3 ===================");
        System.out.println("Calculadora de conversão da temperatura °F para °C");
        System.out.println("Escreva o valor da temperatura desejada em °F:");
        double numeroUm = sc.nextDouble();
        double conversaocelsius = (numeroUm - 32)/ 1.8;
        System.out.printf("A temperatura de " + numeroUm + "°F corresponde a " + (Math.round(conversaocelsius)) + "°C");
        sc.close();
    }   
}
