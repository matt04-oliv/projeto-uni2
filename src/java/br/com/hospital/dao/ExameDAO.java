package java.br.com.hospital.dao;

import java.br.com.hospital.model.Exame;

public interface ExameDAO {

    void inserir(Exame exame);
    void atualizar(Exame exame);
    void deletar(int id);
    Exame buscarPorId(int id);
}
