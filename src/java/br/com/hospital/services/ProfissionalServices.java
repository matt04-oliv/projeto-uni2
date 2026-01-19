package java.br.com.hospital.services;

import java.br.com.hospital.dao.ProfissionaisSaudeDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.ProfissionaisSaude;

public class ProfissionalServices {

    private ProfissionaisSaudeDAO profissionaisSaudeDAO;

    public ProfissionalServices(ProfissionaisSaudeDAO profissionaisSaudeDAO) {
        this.profissionaisSaudeDAO = profissionaisSaudeDAO;
    }

    public void cadastrarProfissional(ProfissionaisSaude profissional) {

        if (profissional == null) {
            throw new ValidationException("Profissional de saúde não pode ser nulo.");
        }

        if (profissional.getNome() == null || profissional.getNome().isEmpty()) {
            throw new ValidationException("Nome do profissional é obrigatório.");
        }

        if (profissional.getCargo() == null || profissional.getCargo().isEmpty()) {
            throw new ValidationException("Cargo do profissional é obrigatório.");
        }

        if (profissional.getRegistroProfissional() == null || profissional.getRegistroProfissional().isEmpty()) {
            throw new ValidationException("Registro profissional é obrigatório.");
        }

        if (profissional.getCpf() == null || profissional.getCpf().isEmpty()) {
            throw new ValidationException("CPF do profissional é obrigatório.");
        }

        profissionaisSaudeDAO.inserir(profissional);
    }

    public void atualizarProfissional(ProfissionaisSaude profissional) {

        if (profissional == null) {
            throw new ValidationException("Profissional de saúde não pode ser nulo.");
        }

        profissionaisSaudeDAO.atualizar(profissional);
    }

    public void removerProfissional(int cpf) {

        if (cpf <= 0) {
            throw new ValidationException("CPF inválido para remoção do profissional.");
        }

        profissionaisSaudeDAO.deletar(cpf);
    }

    public ProfissionaisSaude buscarProfissionalPorCPF(int cpf) {

        if (cpf <= 0) {
            throw new ValidationException("CPF inválido para busca do profissional.");
        }

        ProfissionaisSaude profissional = profissionaisSaudeDAO.buscarPorCPF(cpf);

        if (profissional == null) {
            throw new DataNotFoundException("Profissional de saúde não encontrado.");
        }

        return profissional;
    }
}
