public interface PacienteDAO {

    void inserir(Paciente paciente);
    void atualizar(Paciente paciente);
    void deletar(int cpf);
    Paciente buscarPorCPF(int cpf);
}
