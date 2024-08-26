public class InvestimentoTeste {
  public static void main(String[] args) {
    
    // Criando o objeto
    Investimento investimento = new Investimento("Cripto", 750.00, "24/08/2024");

    // Uma observação futura para o parametro dataInicio, seria criar uma função que pegue a data do dispositivo, igual a dataTransacao.

    // Executando o metodo investir
    investimento.investir();
  }
}
