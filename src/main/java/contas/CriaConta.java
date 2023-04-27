package contas;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo da primeiraConta é " + primeiraConta.saldo + " reais.");
        primeiraConta.saldo += 100;
        System.out.println("O saldo da primeiraConta é " + primeiraConta.saldo + " reais.");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("O saldo da segundaConta é " + segundaConta.saldo + " reais.");
        segundaConta.saldo += 100;
        System.out.println("O saldo da segundaConta é " + segundaConta.saldo + " reais.");


    }
}
