package java.br.com.hospital.model;

public class ProfissionaisSaude {

    private String nome;
    private String cargo;
    private String especialidade;
    private String registroProfissional;
    private String cpf;
    private String turno;

    public ProfissionaisSaude() {}

    public ProfissionaisSaude(String nome, String cargo, String especialidade, String registroProfissional,
                              String cpf, String turno) {
        this.nome = nome;
        this.cargo = cargo;
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.cpf = cpf;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // toString
    @Override
    public String toString() {
        return "ProfissionaisSaude{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", registroProfissional='" + registroProfissional + '\'' +
                ", cpf='" + cpf + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }
}

