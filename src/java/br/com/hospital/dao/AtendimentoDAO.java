package java.br.com.hospital.dao;

import java.br.com.hospital.model.Atendimento;

public interface AtendimentoDAO {

    void inserir(Atendimento atendimento);
    void atualizar(Atendimento atendimento);
    void deletar(int id);
    Atendimento buscarPorId(int id);
}
