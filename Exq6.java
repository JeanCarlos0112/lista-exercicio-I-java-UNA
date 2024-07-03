import java.util.Scanner;

public class Exq6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("========== Exercicio 6 ==========");
        System.out.println("Caculo de log entre dois números");
        System.out.println("Por favor, digite um número: (Logaritmando)");
        double numeroUm = sc.nextDouble();
        System.out.println("Por favor, digite outro número: (Base)");
        double numeroDois = sc.nextDouble();
        double calculoLog = Math.log(numeroUm)/ Math.log(numeroDois);
        System.out.println("O resultado de " + numeroUm + " na base " + numeroDois + " é " + calculoLog);
        sc.close();

    }
    
}
