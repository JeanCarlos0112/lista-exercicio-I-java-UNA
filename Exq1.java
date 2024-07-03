import java.util.Scanner;
public class Exq1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================ Exercicio 1 ================");
    System.out.println("Calculo de média aritmética entre dois números");
    System.out.println("Digite um número: ");
    float numeroUm = sc.nextFloat();
    System.out.println("Digite outro número: ");
    float numeroDois = sc.nextFloat();
    float mediaNum = (numeroUm + numeroDois) / 2;
    System.out.println("A média entre " + numeroUm + " e " + numeroDois + " é: " + mediaNum);
    sc.close();

}
}