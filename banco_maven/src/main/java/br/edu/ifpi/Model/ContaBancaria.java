package br.edu.ifpi.Model;

public  class ContaBancaria {
    private String numero;
    private double saldo;
    private String titular;

    //metodos getters e setters
    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor){

    }
    
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //metodo sacar
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //metodo depositar
    public void depositar(double valor) {
        this.saldo += valor;
    }
    

}
