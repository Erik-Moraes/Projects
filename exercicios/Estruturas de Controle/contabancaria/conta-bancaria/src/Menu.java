
import java.util.Scanner;
public class Menu {

    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;
    private Conta conta;


    public Menu(Conta conta) {
        this.conta = conta;
    }

    public void iniciar() {
        int opcao = -1;

        do {
            exibeMenu();
            opcao = scanner.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println("Saldo da conta R$:" + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Cheque especial" + conta.getLimiteChequeEspecial());
                    break;

                case 3:
                    System.out.println("Insira o valor a depositar:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.println("Insira o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.saque(valorSaque);
                    break;

                case 5:
                    System.out.println("Insira o valor do boleto a ser pago: ");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;

                case 6:
                    conta.exibirDados();
                    break;
                case 0:
                    System.out.println("Até a próxima!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 0);
    }


    private void exibeMenu(){
            System.out.println
                    ("================================= \n" +
                            "SELECIONE UMA OPÇÃO ABAIXO: \n" +
                            "1 - Consultar saldo \n" +
                            "2 - Consultar cheque especial \n" +
                            "3 - Deposito \n" +
                            "4 - Saque \n" +
                            "5 - Pagar um boleto \n" +
                            "6 - Dados da conta \n" +
                            "0 - Sair \n" +
                            "=================================");

    }



}
