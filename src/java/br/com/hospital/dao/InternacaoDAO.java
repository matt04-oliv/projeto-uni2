package java.br.com.hospital.dao;

import java.br.com.hospital.model.Internacao;

public interface InternacaoDAO {

    void inserir(Internacao internacao);
    void atualizar(Internacao internacao);
    void deletar(int id);
    Internacao buscarPorId();
}
