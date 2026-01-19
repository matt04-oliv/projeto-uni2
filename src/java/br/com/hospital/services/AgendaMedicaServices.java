package java.br.com.hospital.services;

import java.br.com.hospital.dao.AgendaMedicaDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.AgendaMedica;

public class AgendaMedicaServices {

    private AgendaMedicaDAO agendaMedicaDAO;

    public AgendaMedicaServices(AgendaMedicaDAO agendaMedicaDAO) {
        this.agendaMedicaDAO = agendaMedicaDAO;
    }

    public void cadastrarAgenda(AgendaMedica agenda) {

        if (agenda == null) {
            throw new ValidationException("Agenda médica não pode ser nula.");
        }

        if (agenda.getData() == null || agenda.getData().isEmpty()) {
            throw new ValidationException("Data da agenda é obrigatória.");
        }

        if (agenda.getHorarioFimInicio() == null || agenda.getHorarioFimInicio().isEmpty()) {
            throw new ValidationException("Horário da agenda é obrigatório.");
        }

        agendaMedicaDAO.inserir(agenda);
    }

    public void atualizarAgenda(AgendaMedica agenda) {

        if (agenda == null) {
            throw new ValidationException("Agenda médica não pode ser nula.");
        }

        agendaMedicaDAO.atualizar(agenda);
    }

    public void removerAgenda(int id) {

        if (id <= 0) {
            throw new ValidationException("ID inválido para remoção da agenda.");
        }

        agendaMedicaDAO.deletar(id);
    }

    public AgendaMedica buscarAgendaPorId(int id) {

        if (id <= 0) {
            throw new ValidationException("ID inválido para busca da agenda.");
        }

        AgendaMedica agenda = agendaMedicaDAO.buscarPorId(id);

        if (agenda == null) {
            throw new DataNotFoundException("Agenda médica não encontrada.");
        }

        return agenda;
    }
}
