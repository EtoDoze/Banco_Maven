package br.edu.ifpi.Model;


 public class Diretor extends Funcionario implements Autenticavel {
    private String departamento;
    private String senha;
    
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
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
