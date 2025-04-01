import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //declaração das variaveis
        double tempo;
        double velocidade;
        double qdlitros;

        //entrada de dados
        System.out.println("Escreva o valor do tempo gasto: ");
        tempo = sc.nextDouble();

        System.out.println("Escreva o valor da velocidade média: ");
        velocidade = sc.nextDouble();

       //processamento de dados

        qdlitros = (velocidade * tempo) / 10.5;

        //saida de dados
        System.out.println("A quantidade de Litros gasta é: " + qdlitros);


    }
}
