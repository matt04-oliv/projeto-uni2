package java.br.com.hospital.dao;

import java.br.com.hospital.model.AgendaMedica;

public interface AgendaMedicaDAO {

    void inserir(AgendaMedica agenda);
    void atualizar(AgendaMedica agenda);
    void deletar(int id);
    AgendaMedica buscarPorId(int id);
}
