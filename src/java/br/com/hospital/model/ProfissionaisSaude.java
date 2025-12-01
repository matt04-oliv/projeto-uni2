package java.br.com.hospital.model;

public class ProfissionaisSaude {

    private String nome;
    private String cargo;
    private String especialidade;
    private String registroProfissional;
    private int cpf;
    private String turno;

    public ProfissionaisSaude() {}

    public ProfissionaisSaude(String nome, String cargo, String especialidade, String registroProfissional,
                              int cpf, String turno) {
        this.nome = nome;
        this.cargo = cargo;
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.cpf = cpf;
        this.turno = turno;
    }

    // getters, setters, toString()
}
