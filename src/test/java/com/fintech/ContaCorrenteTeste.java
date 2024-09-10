package test.java.com.fintech;

import main.java.com.fintech.ContaCorrente;

public class ContaCorrenteTeste {
  public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente(4934, 3290);

    // sacando valores
    contaCorrente.sacarConta(200);
    
  }
}
