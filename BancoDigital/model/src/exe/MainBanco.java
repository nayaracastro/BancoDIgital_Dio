package exe;


import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;



public class MainBanco {
    public static void main(String[] args) {

        Cliente cli = new Cliente();
        cli.setNome("Maria da Silva");


        Conta cc= new ContaCorrente(cli);
        Conta cp= new ContaPoupanca(cli);

        cc.depositar(1700);
        cc.sacar(500);
        cc.imprimirExtrato();

        cp.depositar(5000);
        cp.sacar(250);
        cp.imprimirExtrato();


    }
}
