
package br.edu.ifpi.Model;

public class ContaCorrente extends ContaBancaria {
    private double limite;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public boolean sacar(double valor) {
        if(getSaldo()+getLimite()<=valor) {
            return false;
        } else {
            if(getSaldo()<valor) {
                double novolimite=getLimite()-(valor-getSaldo());
                setLimite(novolimite);
                double novoSaldo = getSaldo() - valor;
                setSaldo(novoSaldo);
                return true;
            }
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            return true;
        }
    }

    
}
    


