package java.br.com.hospital.model;

public class Exame {

    private String tipoExame;
    private String dataExame;
    private String resultado;
    private String cpfPaciente;

    public Exame() {}

    public Exame(String tipoExame, String dataExame, String resultado, String cpfPaciente) {
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.resultado = resultado;
        this.cpfPaciente = cpfPaciente;
    }

    // getters, setters, toString()
}
