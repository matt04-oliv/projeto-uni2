package java.br.com.hospital.dao;

import java.br.com.hospital.model.ProfissionaisSaude;

public interface ProfissionaisSaudeDAO {

    void inserir(ProfissionaisSaude profissional);
    void atualizar(ProfissionaisSaude profissional);
    void deletar(int cpf);
    ProfissionaisSaude buscarPorCPF(int cpf);
}
