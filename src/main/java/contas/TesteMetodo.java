package contas;

import java.io.PrintStream;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        conta1.depositar(50);
        System.out.println("Saldo conta1: " + conta1.saldo);

        conta1.sacar(50);
        System.out.println("Saldo conta1: " + conta1.saldo);

        conta1.sacar(250);
        System.out.println("Saldo atual conta1: " + conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 100;
        conta2.transferir(50, conta2);
        System.out.println("Saldo conta2: " + conta2.saldo);
        System.out.println("Saldo conta1: " + conta1.saldo);

        conta2.transferir(200, conta2);
        System.out.println("Saldo conta2: " + conta2.saldo);
        System.out.println("Saldo conta1: " + conta1.saldo);
    }
}
