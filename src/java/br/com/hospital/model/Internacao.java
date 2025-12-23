package java.br.com.hospital.model;


public class Internacao {

    private Paciente paciente;
    private String dataEntrada;
    private String dataSaida;
    private String leitoMotivo;

    public Internacao() {
        this.paciente = new Paciente();
    }

    public Internacao(Paciente paciente, String dataEntrada, String dataSaida, String leitoMotivo) {
        this.paciente = paciente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.leitoMotivo = leitoMotivo;
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getLeitoMotivo() {
        return leitoMotivo;
    }

    public void setLeitoMotivo(String leitoMotivo) {
        this.leitoMotivo = leitoMotivo;
    }

    // toString
    @Override
    public String toString() {
        return "Internacao{" +
                "paciente=" + paciente +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", dataSaida='" + dataSaida + '\'' +
                ", leitoMotivo='" + leitoMotivo + '\'' +
                '}';
    }
}
