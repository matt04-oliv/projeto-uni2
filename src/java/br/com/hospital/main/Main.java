package java.br.com.hospital.main;

import java.br.com.hospital.model.*;
import java.br.com.hospital.services.*;
import java.br.com.hospital.exception.*;

public class Main {

    public static void main(String[] args) {

        // ==== INICIALIZAÇÃO DOS SERVICES (mock DAO) ====
        // Aqui você substituiria por implementações reais de DAO conectadas ao banco
        PacienteServices pacienteServices = new PacienteServices(new PacienteDAO() {
            @Override
            public void inserir(Paciente paciente) { System.out.println("Paciente inserido: " + paciente); }
            @Override
            public void atualizar(Paciente paciente) { System.out.println("Paciente atualizado: " + paciente); }
            @Override
            public void deletar(int id) { System.out.println("Paciente deletado: " + id); }
            @Override
            public Paciente buscarPorCPF(int cpf) { return null; }
        });

        AtendimentoServices atendimentoServices = new AtendimentoServices(new AtendimentoDAO() {
            @Override
            public void inserir(Atendimento atendimento) { System.out.println("Atendimento inserido: " + atendimento); }
            @Override
            public void atualizar(Atendimento atendimento) { System.out.println("Atendimento atualizado: " + atendimento); }
            @Override
            public void deletar(int id) { System.out.println("Atendimento deletado: " + id); }
            @Override
            public Atendimento buscarPorId(int id) { return null; }
        });

        ExameServices exameServices = new ExameServices(new ExameDAO() {
            @Override
            public void inserir(Exame exame) { System.out.println("Exame inserido: " + exame); }
            @Override
            public void atualizar(Exame exame) { System.out.println("Exame atualizado: " + exame); }
            @Override
            public void deletar(int id) { System.out.println("Exame deletado: " + id); }
            @Override
            public Exame buscarPorId(int id) { return null; }
        });

        InternacaoServices internacaoServices = new InternacaoServices(new InternacaoDAO() {
            @Override
            public void inserir(Internacao internacao) { System.out.println("Internação inserida: " + internacao); }
            @Override
            public void atualizar(Internacao internacao) { System.out.println("Internação atualizada: " + internacao); }
            @Override
            public void deletar(int id) { System.out.println("Internação deletada: " + id); }
            @Override
            public Internacao buscarPorId(int id) { return null; }
        });

        // ==== CRIAÇÃO DE OBJETOS ====
        Paciente paciente1 = new Paciente("Matheus Oliveira", "2001-01-19", "12345678901", "Rua A", "987654321", "Pai", "Adulto");
        Atendimento atendimento1 = new Atendimento("2026-01-19 10:00", "Consulta", paciente1);
        Exame exame1 = new Exame("Sangue", "2026-01-19", "Normal", paciente1);
        Internacao internacao1 = new Internacao(paciente1, "2026-01-19", null, "Observação");

        // ==== EXECUTANDO OPERACOES COM TRATAMENTO DE EXCEPTIONS ====
        try {
            pacienteServices.cadastrarPaciente(paciente1);
            atendimentoServices.registrarAtendimento(atendimento1);
            exameServices.registrarExame(exame1);
            internacaoServices.internarPaciente(internacao1);

        } catch (ValidationException ve) {
            System.out.println("Erro de validação: " + ve.getMessage());
        } catch (DataNotFoundException de) {
            System.out.println("Erro de busca: " + de.getMessage());
        } catch (DatabaseException db) {
            System.out.println("Erro de banco de dados: " + db.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        // ==== EXEMPLOS DE BUSCA ====
        try {
            Paciente pacienteBuscado = pacienteServices.buscarPacientePorCpf(123456789);
            System.out.println("Paciente encontrado: " + pacienteBuscado);
        } catch (DataNotFoundException e) {
            System.out.println("Paciente não encontrado!");
        }

        try {
            Atendimento atendimentoBuscado = atendimentoServices.buscarAtendimentoPorId(1);
            System.out.println("Atendimento encontrado: " + atendimentoBuscado);
        } catch (DataNotFoundException e) {
            System.out.println("Atendimento não encontrado!");
        }

        try {
            Exame exameBuscado = exameServices.buscarExamePorId(1);
            System.out.println("Exame encontrado: " + exameBuscado);
        } catch (DataNotFoundException e) {
            System.out.println("Exame não encontrado!");
        }
    }
}
