import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x, y, raiz, potencia;

        System.out.println("x --> ");
        x = sc.nextDouble();
        System.out.println("y --> ");
        y = sc.nextDouble();

        potencia = Math.pow(x, y);
        raiz = Math.sqrt(x + y);

        System.out.println("x ^ y = " + potencia);
        System.out.println(" Raiz = " + raiz);


    }

}
