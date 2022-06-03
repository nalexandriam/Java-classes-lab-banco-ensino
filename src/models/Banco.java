package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco {
    public static List<Conta> contasCorrentes = new ArrayList<Conta>();
    public static List<Conta> contasPoupanca = new ArrayList<Conta>();

    public static void addConta(Conta conta){
        if(conta.getTipoConta() == tipoDaConta.CORRENTE){
            contasCorrentes.add(conta);
        }
        else{
            contasPoupanca.add(conta);
        }
    }
    public static void listContasPoupanca(){
        for(Conta conta: contasCorrentes){
            conta.extrato();
        }
    }
    public static void listContasCorrente(){
        for(Conta conta: contasPoupanca){
            conta.extrato();
        }
    }
}
