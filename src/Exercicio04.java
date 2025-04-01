import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        //declaração de veriaveis
        double salariominimo;
        double quantidadequilo;
        double valordokw, total, totalcomdesconto;

        //entrada de dados
        System.out.print("Digite o valor do salário Minimo:");
        salariominimo = sc.nextDouble();

        System.out.print("Digite o valor da quantidade de quilowatts gasto:");
        quantidadequilo = sc.nextDouble();

        //processamento de dados
        valordokw = salariominimo / 7 / 100;
        total = valordokw * quantidadequilo;
        totalcomdesconto = total * 0.9;
        // ou * 90/100

        //saida de dados
        System.out.println("Valor do quilowatt R$ " + df.format(valordokw));
        System.out.println("Total a pagar R$ " + df.format(total));
        System.out.println("Total a pagar com 10% de desconto R$ " + df.format(totalcomdesconto));

    }
}
