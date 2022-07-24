public class ContaCorrente extends Conta {

    protected double chequeEspecial;

    public ContaCorrente(Cliente cliente, double chequeEspecial) {
        super(cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.chequeEspecial + this.saldo) {
            System.out.println("Saque recusado: saldo insuficiente");
            super.imprimirInfosComuns();
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > this.chequeEspecial + this.saldo) {
            System.out.println("Transferencia recusada: saldo insuficiente");
            super.imprimirInfosComuns();
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
