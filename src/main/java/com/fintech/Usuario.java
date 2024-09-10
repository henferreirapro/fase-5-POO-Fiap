package main.java.com.fintech;


public class Usuario extends Pessoa {

  private String senha;


  // Iniciando o construtor
  public Usuario() {}

  // add parametros no construtor
  public Usuario(String nomeUsuario, String email, String senha) {
    super(nomeUsuario, email);
    this.senha = senha;
    
  }


  // add get e set da senha do usuario
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  // add metodo exibir os dados de uma pessoa
  @Override
  public void exibirDadosPessoa() {
    super.exibirDadosPessoa();
    System.out.printf("Senha do usuario: %s %n", senha);
  }


  // Executando método da mensagem
  public void msgRegistro() {
    System.out.printf("%nUsuario Registrado com Sucesso, prazer em te conhecer %s! %n", getNomeUsuario());

    System.out.println("Enviamos um e-mail de confirmação para o e-mail: " + getEmail());

    // a senha só será mostrada aqui para fins de visualização.
    System.out.printf("Senha salva com Sucesso: %s %n", senha);
  }
}

