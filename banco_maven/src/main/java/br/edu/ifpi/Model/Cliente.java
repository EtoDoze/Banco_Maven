
package br.edu.ifpi.Model;
public class Cliente extends PessoaFisica implements Autenticavel {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }
    
}
