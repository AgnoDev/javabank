package contas;

public class Conta {
    int agencia;
    int numero;
    String titular;
    double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public boolean transferir(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso");
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
