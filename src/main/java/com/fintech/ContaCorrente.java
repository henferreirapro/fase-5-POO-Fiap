package main.java.com.fintech;


public class ContaCorrente extends Conta {


  public ContaCorrente(int numeroConta, double saldoConta) {
    super(numeroConta, saldoConta);
  
  }

  @Override
  public void sacarConta(double valorSaque) {
    if(valorSaque > 0 && valorSaque <= getSaldoConta()) {
      setSaldoConta(getSaldoConta() - valorSaque);
      System.out.printf("Valor Sacado Foi: %.2f. %nSaldo Atual: %.2f. %n", valorSaque, getSaldoConta());

    } else {
      System.out.printf("Saldo Insuficiente, voce possui %.2f na sua conta.", getSaldoConta());
    }
    
  }
}
