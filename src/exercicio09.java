import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando as variaveis
        int valor, numeroinvertido;
        int centena, dezena, unidade;

        //entrada de dados
        System.out.println("Digite um número de 3 digitos: ");
         valor = sc.nextInt();

         //processamento de dados
       centena = valor / 100;
       dezena = valor % 100 / 10 ;
       unidade = valor % 10;

        numeroinvertido = unidade * 100 + dezena * 10 + centena;


        //saida de dados
        System.out.println("O valor invertido é: " +numeroinvertido);
    }
}
