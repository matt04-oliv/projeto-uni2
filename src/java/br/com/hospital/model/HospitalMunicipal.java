package java.br.com.hospital.model;

public class HospitalMunicipal {

    private String nome;
    private int cnpj;
    private String diretor;

    public HospitalMunicipal() {}

    public HospitalMunicipal(String nome, int cnpj, String diretor) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.diretor = diretor;
    }

    // getters, setters, toString()
}
