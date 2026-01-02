package java.br.com.hospital.services;

import java.br.com.hospital.dao.AtendimentoDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.Atendimento;

public class AtendimentoServices {

    private AtendimentoDAO atendimentoDAO;

    public AtendimentoServices(AtendimentoDAO atendimentoDAO) {
        this.atendimentoDAO = atendimentoDAO;
    }

    public void registrarAtendimento(Atendimento atendimento) {

        if (atendimento == null) {
            throw new ValidationException("Atendimento não pode ser nulo.");
        }

        if (atendimento.getDataHora() == null || atendimento.getDataHora().isEmpty()) {
            throw new ValidationException("Data e hora do atendimento são obrigatórias.");
        }

        if (atendimento.getTipoAtendimento() == null || atendimento.getTipoAtendimento().isEmpty()) {
            throw new ValidationException("Tipo de atendimento é obrigatório.");
        }

        if (atendimento.getPaciente() == null) {
            throw new ValidationException("Atendimento deve estar vinculado a um paciente.");
        }

        atendimentoDAO.inserir(atendimento);
    }

    public void atualizarAtendimento(Atendimento atendimento) {

        if (atendimento == null) {
            throw new ValidationException("Atendimento não pode ser nulo.");
        }

        atendimentoDAO.atualizar(atendimento);
    }

    public void removerAtendimento(int id) {
        atendimentoDAO.deletar(id);
    }

    public Atendimento buscarAtendimentoPorId(int id) {

        Atendimento atendimento = atendimentoDAO.buscarPorId(id);

        if (atendimento == null) {
            throw new DataNotFoundException("Atendimento não encontrado.");
        }

        return atendimento;
    }
}
