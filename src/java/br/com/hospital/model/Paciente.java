package java.br.com.hospital.model;

public class Paciente {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private String endereco;
    private String telefone;
    private String contatoEmergencia;
    private String tipoPaciente;

    public Paciente() {}

    public Paciente(String nome, String dataNascimento, String cpf, String endereco, String telefone,
                    String contatoEmergencia, String tipoPaciente) {
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
