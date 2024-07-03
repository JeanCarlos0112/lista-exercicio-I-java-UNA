import java.util.Scanner;

public class Exq10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("============================== Exercicio 10 ==============================");
        System.out.println("Calculadora de média aritmetica, harmonica e geometrica entre três valores");
        System.out.println("==========================================================================");
        System.out.println("Digite um número: ");
        float x = scan.nextFloat();
        System.out.println("Digite outro número: ");
        float y = scan.nextFloat();
        System.out.println("Digite mais um número: ");
        float z = scan.nextFloat();
        float media = x+y+z/3;
        float mediaHarm = ((1/x) + (1/y) + (1/z))/3;
        double mediaGeo = Math.cbrt(x*y*z);
        System.out.println("A média é: " + media +", a média harmônica é: " + mediaHarm +", a média geometrica é: " + mediaGeo);
        scan.close();
}
}