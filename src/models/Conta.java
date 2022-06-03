package models;

 enum tipoDaConta  {
        CORRENTE, POUPANCA
    } 

public abstract class  Conta {
    protected double saldo = 0;
    protected String nome;
    protected long numeroDaConta;
    protected tipoDaConta tipoConta;
    protected static long numeroDisponivelParaConta=0;
    
    public void depositar(double valor){
        this.saldo += valor; 
    }
    public void extrato(){
        System.out.println("#############");
        System.out.println("Conta numero  "+numeroDaConta);
        System.out.println("Conta "+tipoConta);
        System.out.println("Saldo "+saldo);
        System.out.println("#############");
    }

    public static long getNumeroDisponivelParaConta() {
        return numeroDisponivelParaConta++;
    }
    public void sacar(double valor){
        if(saldo >= valor)
            this.saldo-= valor;
    }
    public synchronized String getNome() {
        return nome;
    }
    public synchronized void setNome(String nome) {
        this.nome = nome;
    }
    public synchronized long getNumeroDaConta() {
        return numeroDaConta;
    }
    public synchronized void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public synchronized double getSaldo() {
        return saldo;
    }
    public synchronized void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    public tipoDaConta getTipoConta() {
        return tipoConta;
    }
}
