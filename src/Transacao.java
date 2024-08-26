public class Transacao {

  private String tipoTransacao;
  private double valorTransacao;
  private String dataTransacao;

  // Iniciando o construtor
  public Transacao() {}

  // Add parametros ao construtor
  public Transacao(String tipoTransacao, double valorTransacao, String dataTransacao) {
    this.tipoTransacao = tipoTransacao;
    this.valorTransacao = valorTransacao;
    this.dataTransacao =  dataTransacao;

  }

  // Executando método de mensagem de transação
  public void transacaoRealizada() {

    System.out.println("\nTipo de Transação feita: " + tipoTransacao + ".");
    
    System.out.printf("Valor da Transação: R$ %.2f. %n", valorTransacao);

    System.out.println("Valor depositado no dia " + dataTransacao + ".");
  }

}
