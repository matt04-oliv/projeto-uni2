package java.br.com.hospital.services;

import java.br.com.hospital.dao.PacienteDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.Paciente;

public class PacienteServices {

    private PacienteDAO pacienteDAO;

    public PacienteServices(PacienteDAO pacienteDAO) {
        this.pacienteDAO = pacienteDAO;
    }

    public void cadastrarPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new ValidationException("Paciente não pode ser nulo.");
        }

        if (paciente.getNome() == null || paciente.getNome().isEmpty()) {
            throw new ValidationException("Nome do paciente é obrigatório.");
        }

        if (paciente.getCpf() == null || paciente.getCpf().isEmpty()) {
            throw new ValidationException("CPF do paciente é obrigatório.");
        }

        pacienteDAO.inserir(paciente);
    }

    public void atualizarPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new ValidationException("Paciente não pode ser nulo.");
        }

        pacienteDAO.atualizar(paciente);
    }

    public void removerPaciente(int id) {
        pacienteDAO.deletar(id);
    }

    public Paciente buscarPacientePorCpf(int id) {
        Paciente paciente = pacienteDAO.buscarPorCPF(id);

        if (paciente == null) {
            throw new DataNotFoundException("Paciente não encontrado.");
        }

        return paciente;
    }
}
