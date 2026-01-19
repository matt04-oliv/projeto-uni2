package java.br.com.hospital.services;

import java.br.com.hospital.dao.SetorDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.Setor;

public class SetorServices {

    private SetorDAO setorDAO;

    public SetorServices(SetorDAO setorDAO) {
        this.setorDAO = setorDAO;
    }

    public void cadastrarSetor(Setor setor) {

        if (setor == null) {
            throw new ValidationException("Setor não pode ser nulo.");
        }

        if (setor.getNome() == null || setor.getNome().isEmpty()) {
            throw new ValidationException("Nome do setor é obrigatório.");
        }


        setorDAO.inserir(setor);
    }

    public void atualizarSetor(Setor setor) {

        if (setor == null) {
            throw new ValidationException("Setor não pode ser nulo.");
        }

        setorDAO.atualizar(setor);
    }

    public void removerSetor(int id) {

        if (id <= 0) {
            throw new ValidationException("ID inválido.");
        }

        setorDAO.deletar(id);
    }

    public Setor buscarSetorPorId(int id) {

        Setor setor = setorDAO.buscarPorCpf("cpf");

        if (setor == null) {
            throw new DataNotFoundException("Setor não encontrado.");
        }

        return setor;
    }

}
