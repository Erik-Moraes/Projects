import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pessoa1;
        String pessoa2;
        int idadePessoa1;
        int idadePessoa2;


        System.out.println("Digite o nome da primera pessoa: ");
        pessoa1 = scanner.next();
        System.out.println("Informe a idade de " + pessoa1 + ": ");
        idadePessoa1 = scanner.nextInt();
        System.out.println("Informe o nome da segunda pessoa: ");
        pessoa2 = scanner.next();
        System.out.println("Informe a idade de " + pessoa2 + ": ");
        idadePessoa2 = scanner.nextInt();
        int diferenca = Math.abs(idadePessoa1 - idadePessoa2);
        System.out.println("A diferença do(a) " + pessoa1 + ", para " + pessoa2 + " é: " + (diferenca));


    }
}