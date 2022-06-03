package models;

public class Corrente extends Conta {

    public Corrente(String nome, double saldo){
        this.nome = nome;
        this.numeroDaConta = Conta.getNumeroDisponivelParaConta();
        this.saldo = saldo;
        this.tipoConta = tipoDaConta.CORRENTE;
    }
    public Corrente(String nome){
        this.nome = nome;
        this.numeroDaConta = Conta.getNumeroDisponivelParaConta();
        this.tipoConta = tipoDaConta.CORRENTE;
    }

    public void transferir(Conta contaDestino, double valor){
        saldo -= valor;
        contaDestino.setSaldo(valor);
    }
    
}
