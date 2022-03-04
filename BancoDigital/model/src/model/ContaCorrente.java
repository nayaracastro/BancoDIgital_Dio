package model;

public class ContaCorrente extends  Conta{


    @Override
    public void imprimirExtrato() {
        System.out.println("======= Extrato Conta Corrente =======");
        super.imprimirCupom();
    }

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
}
