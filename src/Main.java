import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número:");
        numero=n.nextInt();

        String resultado;
        resultado = numero % 2 == 0? "Este número é par!" : "Este número é ímpar!";

        System.out.println(resultado);

    }
}