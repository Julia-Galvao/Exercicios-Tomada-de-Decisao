import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        //Scanner é para pegar o valor via teclado
        Scanner sc = new Scanner (System.in);

        double tempc;
        double tempf;

        //entrada de dados
        System.out.println("Digite a temperatura em Celcius --> ");
        tempc = sc.nextDouble();

        //processamento de dados
        tempf = tempc * 9/5 + 32;

        //saida de dados: meu jeito
        // System.out.println("Sua temperatura é:"+ tempf);

//jeito do professor:
        System.out.println(tempc + "°C = " + tempf + "°F");


    }
}
