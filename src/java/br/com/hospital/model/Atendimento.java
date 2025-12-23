package java.br.com.hospital.model;

public class Atendimento {

    private String dataHora;
    private String tipoAtendimento;
    private Paciente paciente;

    public Atendimento() {
        this.paciente = new Paciente();
    }

    public Atendimento(String dataHora, String tipoAtendimento, Paciente paciente) {
        this.dataHora = dataHora;
        this.tipoAtendimento = tipoAtendimento;
        this.paciente = paciente;
    }

    // Getters e Setters
    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // toString
    @Override
    public String toString() {
        return "Atendimento{" +
                "dataHora='" + dataHora + '\'' +
                ", tipoAtendimento='" + tipoAtendimento + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}