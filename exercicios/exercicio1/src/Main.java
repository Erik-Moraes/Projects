import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var Name =  scanner.nextLine();
        System.out.println("Digite sua idade: ");
        var Age = scanner.nextInt();
        System.out.println("Olá " + Name + ". " + "Sua idade é: " + Age + ".");

    }
}