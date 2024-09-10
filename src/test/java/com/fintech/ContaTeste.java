package test.java.com.fintech;

import main.java.com.fintech.Conta;


public class ContaTeste {
  public static void main(String[] args) {

    // Criando o objeto
    Conta conta = new Conta(934, 700.00);

    // Usando o metodo depositar
    conta.depositarSaldo(150);
  }
}
