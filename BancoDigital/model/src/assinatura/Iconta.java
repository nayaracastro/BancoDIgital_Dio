package assinatura;

import model.Conta;
import sun.util.calendar.BaseCalendar;

public interface Iconta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta destinoFinal);
    void imprimirExtrato();

}
