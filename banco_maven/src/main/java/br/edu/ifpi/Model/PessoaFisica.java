package br.edu.ifpi.Model;

import javax.persistence.*;

@Entity
@Table(name = "pessoa_fisica")

public class PessoaFisica extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

}
