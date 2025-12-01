package java.br.com.hospital.dao;

import java.br.com.hospital.model.Paciente;

public interface PacienteDAO {

    void inserir(Paciente paciente);
    void atualizar(Paciente paciente);
    void deletar(int cpf);
    Paciente buscarPorCPF(int cpf);
}
