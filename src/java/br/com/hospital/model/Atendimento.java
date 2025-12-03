package java.br.com.hospital.model;

public class Atendimento {

    private String dataHora;
    private String tipoAtendimento;
    Paciente paciente =  new Paciente();

    public Atendimento() {}

    public Atendimento(String dataHora, String tipoAtendimento, String NewPaciente) {
        this.dataHora = dataHora;
        this.tipoAtendimento = tipoAtendimento;
        this.paciente  = paciente;
    }

    // getters, setters, toString()
}
