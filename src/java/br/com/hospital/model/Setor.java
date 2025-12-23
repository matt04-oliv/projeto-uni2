package java.br.com.hospital.model;

public class Setor {

    private String cpf;
    private int capacidadeLeito;

    public Setor() {}

    public Setor(String cpf, int capacidadeLeito) {
        this.cpf = cpf;
        this.capacidadeLeito = capacidadeLeito;
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
