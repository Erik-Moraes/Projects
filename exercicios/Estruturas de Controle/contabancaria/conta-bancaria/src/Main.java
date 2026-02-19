import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        Conta conta = new Conta (nome, email, depositoInicial);

        Menu menu = new Menu(conta);
        menu.iniciar();

        scanner.close();

    }
}