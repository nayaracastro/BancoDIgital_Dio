package model;

public class ContaPoupanca extends Conta{


    @Override
    public void imprimirExtrato() {
        System.out.println("========= Extrato Conta Poupança ========");
        super.imprimirCupom();


    }

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
}
