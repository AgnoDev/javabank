package contas;

import java.io.PrintStream;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        conta1.depositar(50);
        System.out.println(conta1.saldo);

    }
}
