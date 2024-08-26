public class Investimento {
  
  private String nomeInvestimento;
  private double valorInvestido;
  private String dataInicio;

  // Iniciando o construtor
  public Investimento() {}

  // Add parametros ao construtor
  public Investimento( String nomeInvestimento, double valorInvestido, String dataInicio) {
    this.nomeInvestimento = nomeInvestimento;
    this.valorInvestido = valorInvestido;
    this.dataInicio = dataInicio;

  }

  // Executando o método investir
  public void investir() {
    
    System.out.printf("%nInvestimento no ativo %s feito com sucesso!", nomeInvestimento);

    System.out.printf("%nValor inicial aplicado: R$ %.2f.", valorInvestido);

    System.out.printf("%nInvestimento feito no dia %s.", dataInicio);
    
  }
}
