import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base do triangulo: ");
        int base = scanner.nextInt();
        System.out.println("Informe o valor da altura do triangulo: ");
        int altura = scanner.nextInt();
        int area = base * altura / 2;
        System.out.println("A área do tringulo é: " + area);

    }
}