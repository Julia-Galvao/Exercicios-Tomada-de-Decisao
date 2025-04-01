import java.util.Scanner;
class Exercicio1 {
    public static void main(String[] args) {
        // declaração das variáveis --> criação das variáveis na memória RAM
        Scanner sc = new Scanner(System.in);
        double base, altura;
        double area, perimetro;

        // entrada de dados
        System.out.print("Informe o valor da base: ");
        base = sc.nextDouble();
        System.out.print("Informe o valor da altura: ");
        altura = sc.nextDouble();

        // processamento de dados
        area = (base * altura) / 2;
        perimetro = 2 * (base + altura);

        // saída de dados
        System.out.println("área = " + area);
        System.out.println("perímetro = " + perimetro);

    }

}

