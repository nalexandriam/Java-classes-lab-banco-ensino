package models;

public class Poupanca extends Conta {

    public Poupanca(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.tipoConta = tipoDaConta.POUPANCA;
        this.numeroDaConta = Conta.getNumeroDisponivelParaConta();
    }
    public Poupanca(String nome){
        this.nome = nome;
        this.tipoConta = tipoDaConta.POUPANCA;
        this.numeroDaConta = Conta.getNumeroDisponivelParaConta();
    }

    public void transferir(Conta contaDestino, double valor){
        saldo -= valor;
        contaDestino.setSaldo(valor);
    }
}
