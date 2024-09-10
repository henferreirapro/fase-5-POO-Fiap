package test.java.com.fintech;

import main.java.com.fintech.Usuario;


public class UsuarioTeste {
  public static void main(String[] args) {
    
    // Criando objeto Usuario
    Usuario usuario = new Usuario("Henrique", "henrique.teste@gmail.com", "EsqueciMinhaSenha123");

    // Exibindo os dados do usuario
    usuario.msgRegistro();
    
  }
}
