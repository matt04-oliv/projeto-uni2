public interface InternacaoDAO {

    void inserir(Internacao internacao);
    void atualizar(Internacao internacao);
    void deletar(int id);
    Internacao buscarPorId(int id);
}
