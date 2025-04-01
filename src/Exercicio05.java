import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0,000.00");
        Scanner sc = new Scanner (System.in);

        //declaração das variaveis
        double horaaula, descontoINSS, porcentagem;
        double salariobruto, salarioliquido;
        int horasTrabalhomes;

        //entrada de dados
        System.out.print("digite o valor da hora aula: ");
        horaaula = sc.nextDouble();
        System.out.print("digite o número de aulas trabalhadas no mês: ");
        horasTrabalhomes = sc.nextInt();
        System.out.print("Digite a porcentagem de desconto do INSS: ");
        porcentagem = sc.nextDouble();


        //processamento de dados
        salariobruto = horaaula * horasTrabalhomes;
        descontoINSS = salariobruto * porcentagem / 100;
        salarioliquido = salariobruto - descontoINSS;

        //saida de dados
        System.out.println("Salário Bruto R$ " + df.format(salariobruto));
        System.out.println("Desconto do INSS R$ " + df.format(descontoINSS));
        System.out.println("Salário liquido R$ " + df.format(salarioliquido));


    }
}
