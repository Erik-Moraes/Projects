import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado: ");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.println("A área do quadrado é: " + area);

    }
}