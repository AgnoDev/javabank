package contas;

public class Conta {
    int agencia;
    int numero;
    String titular;
    double saldo;

   public void depositar(double valor) {
       this.saldo += valor;
    }
}
