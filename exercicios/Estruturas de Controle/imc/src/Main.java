import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            System.out.println("Insira o seu peso: ");
            double peso = scanner.nextInt();
            System.out.println("insira a sua altura: ");
            double altura = scanner.nextFloat();
            double imc = peso / (altura * altura);


            System.out.println("TABELA IMC: \n" +
                    "18,5 \"Abaixo do peso\";\n" +
                    "Entre 18,6 e 24,9 \"Peso ideal\";\n" +
                    "Entre 25,0 e 29,9 \"Levemente acima do peso\";\n" +
                    "Entre 30,0 e 34,9 \"Obesidade Grau I\";\n" +
                    "Entre 35,0 e 39,9 \"Obesidade Grau II (Severa)\";\n" +
                    "maior ou igual a 40,0 \"Obesidade III (Mórbida)\";\n" +
                    " ");


            if(imc <= 18.5){
                System.out.println("Abaixo do peso ");
            } else if (imc >= 18.6 && imc <= 24.9) {
                System.out.println("Peso ideal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Levemente acima do peso");
            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println("Obesidade Grau I");
            } else if (imc >= 35.0 && imc <= 39.9) {
                System.out.println("Obesidade Grau II (Sevéra)");
            } else if (imc >= 40.0) {
                System.out.println("Obesidade Grau III (Mórbida)");
            }

            System.out.println("O seu IMC é: " + imc);


    }

}