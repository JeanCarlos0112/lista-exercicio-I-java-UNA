import java.util.Scanner;
import java.text.DecimalFormat;

public class Exq9 {
    public static void main(String[] args){
        final DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("================ Exercicio 9 ================");
        System.out.println("Calculadora de segundos para minutos e horas");
        System.out.println("Por favor, informe os segundos:");
        double segundos = sc.nextDouble();
        if (segundos < 3600){
            double resultadoMinutos = segundos / 60;
            System.out.println(df.format(segundos) +" segundos são "+ df.format(resultadoMinutos)+" minutos");
        }
        else if  (segundos >= 3600){
            double resultadoHoras = segundos / 3600;
            double minutos = resultadoHoras - Math.floor(resultadoHoras);
            int minutosInt = (int) (minutos * 100);
            String minutosFormatado = Integer.toString(minutosInt);
            System.out.println(df.format(segundos) + " segundo(s) são " + Math.round(resultadoHoras) + " hora(s) e " + minutosFormatado + " minuto(s)");

        }
        else{
            System.out.println("Digite um valor válido");
        }
        sc.close();
    }       
}
