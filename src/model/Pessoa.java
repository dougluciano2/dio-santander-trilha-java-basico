package model;

import java.util.Objects;

public class Pessoa {

    private String nomeCompleto;


    public Pessoa(){}

    public Pessoa(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public String toString() {
        return nomeCompleto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nomeCompleto, pessoa.nomeCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeCompleto);
    }
}
