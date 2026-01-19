package java.br.com.hospital.services;

import java.br.com.hospital.dao.InternacaoDAO;
import java.br.com.hospital.exception.DataNotFoundException;
import java.br.com.hospital.exception.ValidationException;
import java.br.com.hospital.model.Internacao;
import java.br.com.hospital.model.Paciente;

public class InternacaoServices {

    private InternacaoDAO internacaoDAO;

    public InternacaoServices(InternacaoDAO internacaoDAO) {
        this.internacaoDAO = internacaoDAO;
    }

    public void internarPaciente(Internacao internacao) {

        if (internacao == null) {
            throw new ValidationException("Internação não pode ser nula.");
        }

        if (internacao.getPaciente() == null) {
            throw new ValidationException("Paciente é obrigatório.");
        }

        if (internacao.getDataEntrada() == null || internacao.getDataEntrada().isEmpty()) {
            throw new ValidationException("Data de entrada é obrigatória.");
        }

        boolean possuiInternacaoAtiva =
                internacaoDAO.existeInternacaoAtiva(internacao.getPaciente()); // regra de domínio, nao é um erro

        if (possuiInternacaoAtiva) {
            throw new ValidationException("Paciente já possui internação ativa.");
        }

        internacaoDAO.inserir(internacao);
    }

    public void darAlta(int idInternacao, String dataSaida) {

        if (dataSaida == null || dataSaida.isEmpty()) {
            throw new ValidationException("Data de saída é obrigatória.");
        }

        Internacao internacao = internacaoDAO.buscarPorId(idInternacao);

        if (internacao == null) {
            throw new DataNotFoundException("Internação não encontrada.");
        }

        internacao.setDataSaida(dataSaida);
        internacaoDAO.atualizar(internacao);
    }
}
