package java.br.com.hospital.model;

public class Internacao {

    private String cpf;
    private String dataEntrada;
    private String dataSaida;
    private String leitoMotivo;

    public Internacao() {}

    public Internacao(String cpf, String dataEntrada, String dataSaida, String leitoMotivo) {
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.leitoMotivo = leitoMotivo;
    }

    // getters, setters, toString()
}
