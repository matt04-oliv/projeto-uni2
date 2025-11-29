public interface ProfissionaisSaudeDAO {

    void inserir(ProfissionaisSaude profissional);
    void atualizar(ProfissionaisSaude profissional);
    void deletar(int cpf);
    ProfissionaisSaude buscarPorCPF(int cpf);
}
