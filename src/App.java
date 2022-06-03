import models.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Criando contas P1(poupança) e C1(corrente)");
        Poupanca p1 = new Poupanca("Joao", 1000);
        Banco.addConta(p1);
        Corrente c1 = new Corrente("Maria");
        Banco.addConta(c1);
        System.out.println("");

        System.out.println("depositando 2000 em C1 ...");
        c1.depositar(2000);
        System.out.println("");

        System.out.println("P1 saldo = "+ p1.getSaldo());
        System.out.println("C1 saldo = "+ c1.getSaldo());
        System.out.println("");

        System.out.println("transferindo 6 de C1 para P1..");
        c1.transferir(p1, 6);
        System.out.println("P1 saldo = "+p1.getSaldo());
        System.out.println("C1 saldo = "+c1.getSaldo());
        System.out.println("");

        System.out.println("sacando 6 de P1...");
        p1.sacar(6);
        System.out.println("");
        
        System.out.println("Imprimindo estrato...");
        Banco.listContasCorrente();
        Banco.listContasPoupanca();
       
    }
}
