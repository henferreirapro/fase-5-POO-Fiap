package main.java.com.fintech;


public class Pessoa {
  private String nomeUsuario;
  private String email;  

  // construtor inicial
  public Pessoa() {}

  // add parametros no construtor
  public Pessoa(String nomeUsuario, String email) {
    this.nomeUsuario = nomeUsuario;
    this.email = email;

  }

  // add get e set nomeUsuario
  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  // add get e set email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // chamando o metodo exibir dados da pessoa
  public void exibirDadosPessoa() {
    System.out.printf("O nome da pessoa é: %s%n", nomeUsuario);
    System.out.printf("O e-mail cadastrado é: %s%n", email);
  }


}
