package main.java.com.fintech;


public class Usuario {

  private String nomeUsuario;
  private String email;
  private String senha;

  // Iniciando o construtor
  public Usuario() {}

  // add parametros no construtor
  public Usuario(String nomeUsuario, String email, String senha) {
    this.nomeUsuario = nomeUsuario;
    this.email = email;
    this.senha = senha;
  }

  // Executando método da mensagem
  public void msgRegistro() {
    System.out.printf("%nUsuario Registrado com Sucesso, prazer em te conhecer %s! %n", nomeUsuario);

    System.out.println("Enviamos um e-mail de confirmação para o e-mail: " + email);

    // a senha só será mostrada aqui para fins de visualização.
    System.out.printf("Senha salva com Sucesso: %s %n", senha);
  }
}

