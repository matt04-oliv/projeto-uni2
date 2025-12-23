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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(){
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContatoEmergencia(){
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia){
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getTipoPaciente(){
        return tipoPaciente;
    }

    public void setTipoPaciente(){
        this.tipoPaciente = tipoPaciente;
    }



    // toString para exibição de dados
    @Override
    public String toString() {
        return "Paciente{" +
                ", nome='" + nome + '\'' +
                ", data de nascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", contato de emergencia='" + contatoEmergencia + '\'' +
                ", tipo de paciente='" + tipoPaciente + '\'' +
                '}';
    }
}

