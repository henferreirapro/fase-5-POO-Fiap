package main.java.com.fintech;



public class Conta {
  
  private int numeroConta;
  private double saldoConta;

  // Iniciando o construtor
  public Conta() {}

  // Add parametros ao construtor
  public Conta(int numeroConta, double saldoConta) {
    this.numeroConta = numeroConta;
    this.saldoConta = saldoConta;
    
  }

  // executando método de deposito
  public void depositarSaldo( double valorDepositado) {
    
    saldoConta += valorDepositado;
    
    System.out.printf("%nConta do Usuario: %d. %nValor depositado: R$ %.2f. %nSaldo atual na conta: R$ %.2f.", numeroConta, valorDepositado, saldoConta);
    
  }
}
