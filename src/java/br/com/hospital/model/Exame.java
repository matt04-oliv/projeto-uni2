package java.br.com.hospital.model;

public class Exame {

    private String tipoExame;
    private String dataExame;
    private String resultado;
    Paciente paciente = new Paciente();

    public Exame() {}

    public Exame(String tipoExame, String dataExame, String resultado, Paciente cpfPaciente) {
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.resultado = resultado;
        this.paciente = cpfPaciente;
    }

    // getters, setters, toString()
}
