import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner sc = new Scanner (System.in);

        //declarar as variaveis
      int numero, resultado;

      //entrada de dados
        System.out.print("Digite um número de 3 digitos: ");
        numero = sc.nextInt();

        //processamento de dados
        resultado = numero / 10 % 10; //ou % 100 / 10

        //saida de dados
        System.out.println("a dezena é: " + resultado);
    }
}
