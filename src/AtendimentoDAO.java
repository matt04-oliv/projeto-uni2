public interface AtendimentoDAO {

    void inserir(Atendimento atendimento);
    void atualizar(Atendimento atendimento);
    void deletar(int id);
    Atendimento buscarPorId(int id);
}
