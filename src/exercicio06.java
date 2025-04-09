import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Escreva o valor de X: ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 1/2));

        System.out.println("y = " + y);



    }
}

