package java.br.com.hospital.services;

import java.br.com.hospital.dao.InternacaoDAO;
import java.br.com.hospital.model.Internacao;

public class InternacaoServices {

    private InternacaoDAO internacaoDAO;

    public InternacaoServices(InternacaoDAO internacaoDAO) {
        this.internacaoDAO = internacaoDAO;
    }

    public void internarPaciente(Internacao internacao) {

        if (internacao == null) {
            throw new IllegalArgumentException("Internação não pode ser nula");
        }

        if (internacao.getPaciente() == null) {
            throw new IllegalArgumentException("Paciente é obrigatório");
        }

        if (internacao.getDataEntrada() == null) {
            throw new IllegalArgumentException("Data de entrada é obrigatória");
        }

        // regra: paciente não pode ter outra internação ativa
        Internacao possuiInternacaoAtiva = internacaoDAO.buscarPorId();

//        if () {
//            throw new IllegalStateException("Paciente já possui internação ativa");
//        }

        internacaoDAO.inserir(internacao);
    }

    public void darAlta(boolean idInternacao, String dataSaida) {

        if (dataSaida == null) {
            throw new IllegalArgumentException("Data de saída é obrigatória");
        }

        Internacao internacao = internacaoDAO.buscarPorId();

        if (internacao == null) {
            throw new IllegalStateException("Internação não encontrada");
        }

        internacao.setDataSaida(dataSaida);
        internacaoDAO.atualizar(internacao);
    }
}
