import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        int binario, decimal;
        int bit1, bit2, bit3, bit4;

        System.out.println("Informe um valor em binário com 4 bits:" );
        binario = sc.nextInt();

        //processamento de dados
        bit1 = binario / 1000;
        bit2 = binario / 100 % 10;
        bit3 = binario % 100 / 10;
        bit4 = binario % 10;
        decimal = bit1 * 8 + bit2 * 4 + bit3 * 2 + bit4;

        //saida de dados
        System.out.println("O valor em decimal é: " + decimal);

    }
}
