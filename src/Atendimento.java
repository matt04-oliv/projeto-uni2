public class Atendimento {

    private String dataHora;
    private String tipoAtendimento;
    private int cpfPaciente;

    public Atendimento() {}

    public Atendimento(String dataHora, String tipoAtendimento, int cpfPaciente) {
        this.dataHora = dataHora;
        this.tipoAtendimento = tipoAtendimento;
        this.cpfPaciente = cpfPaciente;
    }

    // getters, setters, toString()
}
