package java.br.com.hospital.model;

public class Exame {

    private String tipoExame;
    private String dataExame;
    private String resultado;
    Paciente paciente = new Paciente();

    public Exame() {}

    public Exame(String tipoExame, String dataExame, String resultado, Paciente paciente) {
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.resultado = resultado;
        this.paciente = paciente;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
        return "Exame{" +
                "tipoExame='" + tipoExame + '\'' +
                ", dataExame='" + dataExame + '\'' +
                ", resultado='" + resultado + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}

