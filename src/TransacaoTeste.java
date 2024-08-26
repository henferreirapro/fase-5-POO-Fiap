public class TransacaoTeste {
  public static void main(String[] args) {
    
    // Criando o objeto
    Transacao transacao = new Transacao("Saque", 290, "25/08/2024");

    // Uma observação futura para o parametro dataTransacao, seria criar uma função que pegue a data do dispositivo.


    // Executando o método
    transacao.transacaoRealizada();
  }
}
