public class Main {

    public static void main(String[] args) {
        Cliente matheus = new Cliente("Matheus");
        Cliente carlos = new Cliente("Carlos");

        Conta correnteM = new ContaCorrente(matheus, 100);
        Conta correnteC = new ContaCorrente(carlos, 200);

        Conta poupancaM = new ContaPoupanca(matheus);


        correnteC.depositar(1000);
        correnteM.depositar(150);
        correnteM.transferir(50, poupancaM);

        correnteM.imprimirExtrato();
        poupancaM.imprimirExtrato();
        correnteC.imprimirExtrato();

        correnteC.sacar(1100);
        correnteM.sacar(100);
        correnteM.transferir(50, correnteC);
        correnteM.sacar(10);
        correnteC.sacar(200);

        correnteM.imprimirExtrato();
        correnteC.imprimirExtrato();
    }
}
