package java.br.com.hospital.model;

public class Atendimento {

    private String dataHora;
    private String tipoAtendimento;
    private String cpfPaciente;

    public Atendimento() {}

    public Atendimento(String dataHora, String tipoAtendimento, String cpfPaciente) {
        this.dataHora = dataHora;
        this.tipoAtendimento = tipoAtendimento;
        this.cpfPaciente = cpfPaciente;
    }

    // getters, setters, toString()
}
