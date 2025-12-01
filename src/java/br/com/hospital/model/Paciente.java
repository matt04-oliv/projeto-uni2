package java.br.com.hospital.model;

public class Paciente {

    private String nome;
    private String dataNascimento;
    private int cpf;
    private String endereco;
    private int telefone;
    private int contatoEmergencia;
    private String tipoPaciente;

    public Paciente() {}

    public Paciente(String nome, String dataNascimento, int cpf, String endereco, int telefone,
                    int contatoEmergencia, String tipoPaciente) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.contatoEmergencia = contatoEmergencia;
        this.tipoPaciente = tipoPaciente;
    }

    // getters e setters
    // toString()
}
