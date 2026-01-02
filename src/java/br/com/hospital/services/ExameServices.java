package java.br.com.hospital.services;

import java.br.com.hospital.dao.ExameDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.Exame;

public class ExameServices {

    private ExameDAO exameDAO;

    public ExameServices(ExameDAO exameDAO) {
        this.exameDAO = exameDAO;
    }

    public void registrarExame(Exame exame) {

        if (exame == null) {
            throw new ValidationException("Exame não pode ser nulo.");
        }

        if (exame.getTipoExame() == null || exame.getTipoExame().isEmpty()) {
            throw new ValidationException("Tipo de exame é obrigatório.");
        }

        if (exame.getDataExame() == null || exame.getDataExame().isEmpty()) {
            throw new ValidationException("Data do exame é obrigatória.");
        }

        if (exame.getPaciente() == null) {
            throw new ValidationException("Exame deve estar vinculado a um paciente.");
        }

        exameDAO.inserir(exame);
    }

    public void atualizarExame(Exame exame) {

        if (exame == null) {
            throw new ValidationException("Exame não pode ser nulo.");
        }

        exameDAO.atualizar(exame);
    }

    public void removerExame(int id) {
        exameDAO.deletar(id);
    }

    public Exame buscarExamePorId(int id) {

        Exame exame = exameDAO.buscarPorId(id);

        if (exame == null) {
            throw new DataNotFoundException("Exame não encontrado.");
        }

        return exame;
    }
}
