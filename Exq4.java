import java.util.Scanner;

public class Exq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================== Exercicio 4 ==================");
        System.out.println("Calculadora de montante de um valor a ser aplicado");
        System.out.println("Por favor, digite o valor do valor do capital a ser aplicado:");
        double capital = sc.nextDouble();
        System.out.println("Agora, digite o prazo de aplicação em meses:");
        double prazo = sc.nextDouble();
        System.out.println("Agora digite a taxa de juros mensal:");
        double juros = sc.nextDouble();
        double partemontante = (1+juros);
        double montante = capital *Math.pow(partemontante,prazo);
        System.out.println("O montante a ser recebido é: "+ Math.round(montante));
        sc.close();
    }
}
