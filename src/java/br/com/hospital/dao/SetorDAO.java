package java.br.com.hospital.dao;

import java.br.com.hospital.model.Setor;

public interface SetorDAO {

    void inserir(Setor setor);
    void atualizar(Setor setor);
    void deletar(int id);
    Setor buscarPorCpf(String cpf);
}
