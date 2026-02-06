import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o número da tabuada desejada: ");
            Integer numero = scanner.nextInt();

            if (numero.equals(0)){
                System.out.println("Sistema encerrado");
                break;
            }
            System.out.println("TABUADA DO " + numero);
            System.out.println("1 x " + numero + " = " + 1 * numero);
            System.out.println("2 x " + numero + " = " + 2 * numero);
            System.out.println("3 x " + numero + " = " + 3 * numero);
            System.out.println("4 x " + numero + " = " + 4 * numero);
            System.out.println("5 x " + numero + " = " + 5 * numero);
            System.out.println("6 x " + numero + " = " + 6 * numero);
            System.out.println("7 x " + numero + " = " + 7 * numero);
            System.out.println("8 x " + numero + " = " + 8 * numero);
            System.out.println("9 x " + numero + " = " + 9 * numero);
            System.out.println("10 x " + numero + " = " + 10 * numero);

        } while(true);
        scanner.close();
    }


}


