package java.br.com.hospital.model;

public class Internacao {

    Paciente paciente = new Paciente();
    private String dataEntrada;
    private String dataSaida;
    private String leitoMotivo;

    public Internacao() {}

    public Internacao(Paciente cpf, String dataEntrada, String dataSaida, String leitoMotivo) {
        this.paciente = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.leitoMotivo = leitoMotivo;
    }

    // getters, setters, toString()
}
