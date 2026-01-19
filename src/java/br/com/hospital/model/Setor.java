package java.br.com.hospital.model;

public class Setor {

    private String nome;
    private String cpf;
    private int capacidadeLeito;

    public Setor() {}

    public Setor(String nome ,String cpf, int capacidadeLeito) {
        this.nome = nome;
        this.cpf = cpf;
        this.capacidadeLeito = capacidadeLeito;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCapacidadeLeito() {
        return capacidadeLeito;
    }

    public void setCapacidadeLeito(int capacidadeLeito) {
        this.capacidadeLeito = capacidadeLeito;
    }

    // toString
    @Override
    public String toString() {
        return "Setor{" +
                "cpf='" + cpf + '\'' +
                ", capacidadeLeito=" + capacidadeLeito +
                '}';
    }
}
