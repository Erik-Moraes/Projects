public class Conta {


//  Atributos da classe
    private String nome;
    private String email;
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;



    public Conta(String nome, String email, double depositoInicial){

        this.nome = nome;
        this.email = email;
        this.saldo = depositoInicial;
        this.chequeEspecialUsado = 0;

        if (depositoInicial <= 500){
            this.limiteChequeEspecial = 50;
        }else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }

    public void exibirDados() {
        System.out.println("=== Dados da Conta ===");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cheque Especial: R$ " + limiteChequeEspecial);
    }


    public void depositar(double deposito) {

        if (deposito <= 0){
            System.out.println("Saldo insuficiente.");
            return;
        }

        System.out.println("========= DEPÓSITO ==========");


        if(chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.20;
            double totalDevido = chequeEspecialUsado + taxa;

            System.out.println("Você deve R$ " + chequeEspecialUsado +
                    " + R$ " + taxa + " (taxa 20%) = R$ " + totalDevido);

            if (deposito >= totalDevido) {
                deposito -= totalDevido;
                System.out.println("Divida de cheque especial quitada!");
                System.out.println("Taxa de R$" + taxa + " cobrada.");
                chequeEspecialUsado = 0;
            } else {
                double pagamento = deposito / 1.20;
                chequeEspecialUsado -= pagamento;
                deposito = 0;
                System.out.println("Pagamento parcial de R$" + pagamento + "da divida.");
            }

        }

        saldo += deposito;
        System.out.println("Deposito no valor de R$ " + deposito + " realizado com sucesso.");
        System.out.println("Saldo disponivel R$ " + saldo);

    }

    public void saque (double valorASacar) {

        if (valorASacar <= 0) {
            System.out.println("Saldo disponivel: " + this.saldo + ". Saque nao processado.");
            return;
        }

        double saldoDisponivel = this.saldo + getLimiteChequeEspecial();

        if (valorASacar > saldoDisponivel){

            System.out.println("Saldo insuficiente. Valor disponivel: R$ " + saldoDisponivel);
            System.out.println("Saque nao processado");
            return;
        }

        if (valorASacar <= this.saldo) {
            this.saldo -= valorASacar;
            System.out.println("Saque no valor de " + valorASacar + " realizado. Saldo atual: " + this.saldo);
        } else {
            double saldoNegativo = valorASacar - this.saldo;
            this.saldo = 0;
            chequeEspecialUsado += saldoNegativo;

            System.out.println("Saque de R$" + valorASacar + " realizado.");
            System.out.println("Usado R$" + saldoNegativo + " do cheque especial.");
        }

        System.out.println("Saldo atual: R$ " + this.saldo);

    }

    public void pagarBoleto (double boleto){

        if(boleto <= 0){
            System.out.println("Valor invalido para pagamento: ");
            return;
        }

        double saldoDisponivel = saldo + getLimiteChequeEspecial();

         if (boleto > saldoDisponivel) {
             System.out.println("Saldo insuficiente. Valor disponivel: R$ " + saldoDisponivel);
             System.out.println("Pagamento não processado.");
             return;
        }

         if (boleto <= this.saldo){
             this.saldo -= boleto;
            System.out.println("Pagamento de R$ " + boleto + " realizado com sucesso!");

        }
         else {
             double valorDoCheque = boleto - this.saldo;
             saldo = 0;
             chequeEspecialUsado += valorDoCheque;

             System.out.println("Pagamento de R$ " + boleto + " realizado com sucesso!");
             System.out.println("Usado:" + valorDoCheque + " do cheque especial.");
         }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial - chequeEspecialUsado;
    }

    public void setLimiteChequeEspecial(double chequeEspecial) {
        this.limiteChequeEspecial = chequeEspecial;
    }

    public double getChequeEspecialUsado(){
        return chequeEspecialUsado;
    }

}
