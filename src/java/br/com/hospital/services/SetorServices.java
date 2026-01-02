package java.br.com.hospital.services;

import java.br.com.hospital.dao.SetorDAO;
import java.br.com.hospital.model.Setor;

public class SetorServices {

    private SetorDAO setorDAO;

    public SetorServices(SetorDAO setorDAO) {
        this.setorDAO = setorDAO;
    }

    public void cadastrarSetor(Setor setor) {
        if (setor == null) {
            throw new IllegalArgumentException("Setor não pode ser nulo");
        }

        if (setor.getCpf() == null || setor.getCpf().isEmpty()) {
            throw new IllegalArgumentException("Nome do setor é obrigatório");
        }

        setorDAO.inserir(setor);
    }

    public void atualizarSetor(Setor setor) {
        if (setor.getCpf().equals("0")) {
            throw new IllegalArgumentException("ID inválido");
        }

        setorDAO.atualizar(setor);
    }

    public void removerSetor(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }

        setorDAO.deletar(id);
    }

    public Setor buscarSetorPorCpf(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }

        return setorDAO.buscarPorCpf(id);
    }
}
